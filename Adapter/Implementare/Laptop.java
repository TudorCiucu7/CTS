package Adapter.Implementare;

public class Laptop {
    private String serie;
    private int nivelBaterie;

    public Laptop(String serie, int nivelBaterie) {
        this.serie = serie;
        this.nivelBaterie = nivelBaterie;
    }
    public void incarca(IPrizaAmerica priza){
        System.out.println("incarca..");
        this.nivelBaterie+=10;
        priza.incarcaLa110V();
    }
}
