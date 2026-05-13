package Observer2.Implementare;

import java.util.ArrayList;
import java.util.List;

public class PolitiaRomana extends AObservabil {

    private List<String> listaCazuri;
    private int prag;

    public PolitiaRomana(String numeServiciu, int prag) {
        super(numeServiciu);
        this.prag = prag;
        this.listaCazuri = new ArrayList<>();
    }

    public void producereCaz(String text,int nivel){
        this.listaCazuri.add(text);
        if(nivel>this.prag){
            this.notificare(text);
        }
    }


}
