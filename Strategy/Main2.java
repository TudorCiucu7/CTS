package Strategy.Program;

import Strategy.Implementare.Client;
import Strategy.Implementare.PlataCash;

public class Main2 {
    public static void main(String[] args) {
        Client c1 = new Client("Ana");
        c1.setStrategieCurenta(new PlataCash());
        c1.finalizarePlata(300);

    }
}
