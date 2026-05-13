package Adapter.Program;

import Adapter.Implementare.AdapterEuropaToAmerica;
import Adapter.Implementare.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop("vivobook",60);
        l.incarca(new AdapterEuropaToAmerica());
    }
}
