package COR.Program;

import COR.Implementare.*;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new Comanda("ciorba",1,10);
        Comanda c2 = new Comanda("paste",1,30);
        AHandler ospatar = new Ospatar();
        AHandler bucatar = new Bucatar();
        AHandler bucatarSef = new BucatarSef();
        ospatar.setNextHandler(bucatar);
        bucatar.setNextHandler(bucatarSef);

        System.out.println("\n Implementare comanda 1");
        bucatar.ProcesareComanda(c1);
        bucatar.ProcesareComanda(c2);
        //ospatar.ProcesareComanda(c2);

    }
}
