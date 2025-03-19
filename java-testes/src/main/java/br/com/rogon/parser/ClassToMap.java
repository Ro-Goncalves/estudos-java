package br.com.rogon.parser;

import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/*
 * REFS:
 * https://futurestud.io/tutorials/gson-mapping-of-maps
 * https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 */
public class ClassToMap {    
    
    public static void main(String[] args) {
        Gson gson = new Gson();
        Carro carro1 = new Carro("Carro 01", 2023);        

        // System.out.println(carro1);       


        // String jsonClass = gson.toJson(carro1);
        // System.out.println(jsonClass);
        
        // Type mapType = new TypeToken<HashMap<String, String>>(){}.getType();

        // HashMap<String, String> classmMap = gson.fromJson(jsonClass, mapType);
        // System.out.println(classmMap);

        System.out.println("------------------------------------------");
        System.out.println("Classe Para HashMap<String, String>");
        Type mapType2 = new TypeToken<HashMap<String, String>>(){}.getType();
        HashMap<String, String> retorno = classeParaOutraClasse(carro1, mapType2);
        System.out.println(retorno);

        System.out.println("------------------------------------------");
        System.out.println("Json to Class");
        String json = gson.toJson(carro1);        
        Carro jsonParaClasse = jsonParaClasse(json, Carro.class);
        System.out.println(jsonParaClasse);
        
    }

    public static <T> T classeParaOutraClasse(Object origem, Type typeDestino){
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(origem);        
        return gson.fromJson(json, typeDestino);
    }

    public static <T> T jsonParaClasse(String json, Class<T> clazz){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, clazz);
    }
}
