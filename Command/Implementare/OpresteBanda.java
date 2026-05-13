package Command.Implementare;

public class OpresteBanda implements IComanda{

    BandaAlergat executant;

    public OpresteBanda(BandaAlergat executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        executant.opreste();

    }
}
