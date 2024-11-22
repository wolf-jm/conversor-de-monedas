package generador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import moneda.Moneda;
import java.io.FileWriter;
import java.io.IOException;

public class Generador {
    public void guardarJson(Moneda moneda) throws IOException{
        Gson gson =new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter escritura = new FileWriter(moneda.base_code() + "_" + moneda.target_code() + ".json")){
            escritura.write(gson.toJson(moneda));
        System.out.println("Archivo JSON generado: " + moneda.base_code() + "_" + moneda.target_code() + ".json");

        }
    }
}
