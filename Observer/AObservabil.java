package Observer2.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil {
    private List<IObservator> listaObservatori;
    private String numeServiciu;

    public AObservabil(String numeServiciu) {
        this.numeServiciu = numeServiciu;
        this.listaObservatori = new ArrayList<>();
    }
    public void abonareServiciu(IObservator observator){
        listaObservatori.add(observator);
    }
    public void dezabonareServiciu(IObservator observator){
        listaObservatori.remove(observator);
    }
    public void notificare(String mesaj){
        for(IObservator observator:listaObservatori){
            observator.getMesaj(mesaj);
        }
    }
}
