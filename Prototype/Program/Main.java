package Prototype.Program;

import Prototype.Implementare.AbstractJucator;
import Prototype.Implementare.JucatorPrototype;

public class Main {
    public static void main(String[] args) {
        AbstractJucator jucator1 = JucatorPrototype.getVersiune("s1");

        jucator1.setNume("Tudor");

        System.out.println(jucator1.getNume() + jucator1.getMedicamente());
    }
}
