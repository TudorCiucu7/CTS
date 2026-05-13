package COR.Implementare;

public class Bucatar extends AHandler{
    @Override
    public void ProcesareComanda(Comanda comanda) {
        if(comanda.getGrad()>=5 && comanda.getGrad()<=20){
            System.out.println("bucatarul a preluat comanda " + comanda.getProdus());
        }else {
            System.out.println("bucatarul nu poate procesa comanda, comanda a fost trimisa mai departe");
            if (this.getNextHandler()!=null)
                getNextHandler().ProcesareComanda(comanda);
        }
    }
}
