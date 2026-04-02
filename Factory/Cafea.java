package Factory;

public class Cafea implements IBautura{
    @Override
    public void preparare() {
        System.out.println("Pornim espressorul");
        System.out.println("Facem shot espresso");
        System.out.println("Turnam laptele");

    }

    @Override
    public String getDetalii() {
        return "Cafea de specialitate";
    }

    @Override
    public double getPret() {
        return 20;
    }
}
