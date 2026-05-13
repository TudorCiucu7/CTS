package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaRecomandari {
    private static Map<String,IRecomandare> colectieRecomandari;

    static{
        colectieRecomandari = new HashMap<>();
        colectieRecomandari.put("8hSomn", new Recomandare("8h Somn minim"));
        colectieRecomandari.put("Pastile", new Recomandare("Nurofen"));
    }
    public static IRecomandare getRecomandare(String cheie){
        if(!colectieRecomandari.containsKey(cheie)){
            System.out.println("nu s-a gasit cheia");
        }
        return colectieRecomandari.get(cheie);

    }
}
