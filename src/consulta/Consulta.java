package consulta;

import moneda.Moneda;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Consulta {
    private static final String API_KEY= "6449db7c40d6a525c6fdfc47";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public Moneda buscaMoneda (int opcionDeMoneda) throws IOException, InterruptedException{
        String deMoneda;
        String aMoneda;

        switch (opcionDeMoneda) {
            case 1 -> {deMoneda = "USD"; aMoneda = "BOB"; }
            case 2 -> {deMoneda = "BOB"; aMoneda = "USD"; }
            case 3 -> {deMoneda = "USD"; aMoneda = "BRL"; }
            case 4 -> {deMoneda = "BRL"; aMoneda = "USD"; }
            case 5 -> {deMoneda = "USD"; aMoneda = "CAD"; }
            case 6 -> {deMoneda = "CAD"; aMoneda = "USD"; }
            case 7 -> {deMoneda = "USD"; aMoneda = "EUR"; }
            case 8 -> {deMoneda = "EUR"; aMoneda = "USD"; }
            default -> throw new IllegalArgumentException("Opcion invalida.");
        }

        String url = BASE_URL + deMoneda + "/" + aMoneda;
        HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> respuesta = HttpClient.newHttpClient().send(solicitud, HttpResponse.BodyHandlers.ofString());

        if (respuesta.statusCode() != 200) {
            String mensajeError;
            switch (respuesta.statusCode()) {
                case 400 -> mensajeError = "Solicitud incorrecta a la API.";
                case 401 -> mensajeError = "Acceso no autorizado. Verifica tu API key.";
                case 404 -> mensajeError = "Recurso no encontrado. Verifica la URL.";
                case 500 -> mensajeError = "Error interno en el servidor de la API.";
                default -> mensajeError = "Error desconocido. Código: " + respuesta.statusCode();
            }
            throw new IOException("Error al obtener datos de la API: " + mensajeError);
        }

        return new Gson().fromJson(respuesta.body(), Moneda.class);
    }
}