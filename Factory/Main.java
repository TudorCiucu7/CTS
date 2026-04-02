package Factory;

public class Main {
    public static void main(String[] args) {
        IBautura bautura1 = BauturaFactory.getBautura(TipBautura.CAFEA);
        System.out.println(bautura1.getDetalii());

        IBautura bautura2 = BauturaFactory.getBautura(TipBautura.CIOCOLATA_CALDA);
        System.out.println(bautura2.getDetalii());
        ((CiocolataCalda)bautura2).setTipCiocolata("Ciocolata alba");
    }
}
