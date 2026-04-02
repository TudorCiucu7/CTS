package cts.Ciucu.Tudor.as.Singleton1.Program;

import cts.Ciucu.Tudor.as.Singleton1.Implementare.AbstractAngajat;
import cts.Ciucu.Tudor.as.Singleton1.Implementare.CasaMarcatSingleton;
import cts.Ciucu.Tudor.as.Singleton1.Implementare.Casier;

public class Main {
    public static void main(String[] args) {
        AbstractAngajat casier1 = new Casier("Marcel");
        AbstractAngajat casier2 = new Casier("Ionel");

        CasaMarcatSingleton casa  = CasaMarcatSingleton.getInstance();


        System.out.println("Scenariu ideal");

        casa.deschidere(casier1);
        casa.adaugaProdus(casier1,"Lapte");
        casa.adaugaProdus(casier1, "Iaurt");
        casa.consultareStareCurenta();




        System.out.println("Scenariu nedorit");


        casa.deschidere(casier2);
        casa.consultareStareCurenta();



    }
}
