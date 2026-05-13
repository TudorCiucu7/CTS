package Strategy2;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("titel");
        c1.setStrategieCurenta(new Design2D());
        c1.VizualizareProiect();
    }
}
