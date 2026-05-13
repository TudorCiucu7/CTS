package Adapter.Implementare;

public class AdapterEuropaToAmerica extends PrizaEuropa implements IPrizaAmerica{
    @Override
    public void incarcaLa110V() {
        this.incarcaLa230V();
        System.out.println("adaptor care face conversia");
    }
}
