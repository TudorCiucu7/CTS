package COR.Implementare;

public class BucatarSef extends AHandler{
    @Override
    public void ProcesareComanda(Comanda comanda) {
        if(comanda.getGrad()>20){
            System.out.println("bucatar sef a preluat comanda " + comanda.getProdus());
        }
        else {
            System.out.println("nu s-a putut prelua deloc comanda !");
            if(this.getNextHandler()!=null)
                getNextHandler().ProcesareComanda(comanda);
        }
    }
}
