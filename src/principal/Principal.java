package principal;

import consulta.Consulta;
import generador.Generador;
import moneda.Moneda;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();

        while (true) {
            String datos = """
                    ******************************************
                      Bienvenido(a) al conversor de monedas:
                    ******************************************
                    1.Dólar Estado Unidense =>> Peso Boliviano
                    2.Peso Boliviano =>> Dólar Estado Unidense
                    3.Dólar Estado Unidense =>> Real Brasileño
                    4.Real Brasileño =>> Dólar Estado Unidense
                    5.Dólar Estado Unidense =>> Dólar Canadiense
                    6.Dólar Canadiense =>> Dólar Estado Unidense
                    7.Dólar Estado Unidense =>> Euro
                    8.Euro =>> Dólar Estado Unidense
                    9.Salir
                    """;
            System.out.println(datos);

            System.out.println("Elija una opción válida");
            System.out.println("*****************************************");

            try {
                int opcionDeMoneda = Integer.parseInt(lectura.nextLine());

                if (opcionDeMoneda == 9) {
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                }

                if (opcionDeMoneda < 1 || opcionDeMoneda > 8){
                    System.out.println("Por favor, elija una opcion entre 1 Y 8.");
                    continue;
                }

                System.out.println("Ingrese la cantidad a convertir: ");
                double cantidadNumerica;

                try {
                    cantidadNumerica = Double.parseDouble(lectura.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("La cantidad ingresada no es válida. Intente nuevamente.");
                    continue;
                }

                Moneda moneda = consulta.buscaMoneda(opcionDeMoneda);
                double cantidadConvertida = moneda.conversion_rate() * cantidadNumerica;

                System.out.printf("""
                        ************************************
                        Conversión realizada con éxito:
                        %.2f %s equivalen a %.2f %s
                        ************************************
                        """,
                        cantidadNumerica, moneda.base_code(),cantidadConvertida, moneda.target_code());

                Generador generador = new Generador();
                generador.guardarJson(moneda); // llamamos de class Generador
            } catch (NumberFormatException e){
                System.out.println("Numero no valido: " + e.getMessage());
            } catch (RuntimeException | IOException | InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicacion.");
                break;
            }
        }
    }
}
