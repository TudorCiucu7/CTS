package Command.Implementare;

public class Main {
    public static void main(String[] args) {
        Telecomanda t1 = new Telecomanda();
        BandaAlergat b1 =new BandaAlergat("parter");

        t1.setComanda1(new OpresteBanda(b1));
        t1.apasaButon1();
    }
}
