package cts.Ciucu.Tudor.as.Builder1.Program;

import cts.Ciucu.Tudor.as.Builder1.Implementare.Pantof;
import cts.Ciucu.Tudor.as.Builder1.Implementare.TipPantof;

public class Main {
    public static void main(String[] args) {

        Pantof pantof1 = Pantof.getBuilder(TipPantof.balerini,"piele", 43,5).build();
        System.out.println(pantof1);
    }
}
