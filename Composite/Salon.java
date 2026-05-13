package Composite;

public class Salon implements INod{
    private String nume;
    private int nrCazuri;
    private boolean stareCritica;

    public Salon(String nume, int nrCazuri, boolean stareCritica) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;
        this.stareCritica = stareCritica;
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException("nu se poate, scuze");

    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException("nu se poate, scuze");

    }

    @Override
    public INod getNod(int index) {
        return null;
    }

    @Override
    public int getNrTotalCazuri() {
        return this.nrCazuri;
    }
}
