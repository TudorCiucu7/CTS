package Flyweight;

public class Main {
    public static void main(String[] args) {

        Reteta r1 = new Reteta(1,"boala");
        FabricaRecomandari.getRecomandare("Pastile").printare(r1);
    }
}
