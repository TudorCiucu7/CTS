package Composite;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {
    private String denumire;
    private List<INod> listaPacienti = new ArrayList<>();

    public NodStructura(String denumire) {
        this.denumire = denumire;
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void adaugaNod(INod nod) {
        listaPacienti.add(nod);
    }

    @Override
    public void removeNod(INod nod) {
        listaPacienti.remove(nod);
    }

    @Override
    public INod getNod(int index) {
     return  listaPacienti.get(index);
    }

    @Override
    public int getNrTotalCazuri() {
        int total = 0;
        for(INod n : listaPacienti){
            total+=n.getNrTotalCazuri();
        }
        return total;
    }
}
