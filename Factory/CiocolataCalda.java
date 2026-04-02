package Factory;

public class CiocolataCalda implements IBautura{

    private String tipCiocolata;
    private String tipLapte;

    public CiocolataCalda setTipCiocolata(String tipCiocolata) {
        this.tipCiocolata = tipCiocolata;
        return this;
    }

    public CiocolataCalda setTipLapte(String tipLapte) {
        this.tipLapte = tipLapte;
        return this;
    }

    @Override
    public void preparare() {
        System.out.println("Incalzim laptele");
        System.out.println("Spumam lapte + cacao");
        System.out.println("S-a facut");

    }

    @Override
    public String getDetalii() {
        return "Ciocolata calda dulce";
    }

    @Override
    public double getPret() {
        if(tipLapte.equals("Vegetal")){
            return 25;
        }
        else {
            return 20;
        }
    }

    public CiocolataCalda(String tipCiocolata, String tipLapte) {
        this.tipCiocolata = tipCiocolata;
        this.tipLapte = tipLapte;
    }
}
