package COR.Implementare;

public class Ospatar extends AHandler{
    @Override
    public void ProcesareComanda(Comanda comanda) {
        if(comanda.getGrad()<=5){
            System.out.println("ospatarul a preluat comanda : " + comanda.getProdus());
        }else {
            if(getNextHandler()!=null)
                this.getNextHandler().ProcesareComanda(comanda);
        }
    }
}
