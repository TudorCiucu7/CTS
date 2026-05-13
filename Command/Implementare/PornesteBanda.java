package Command.Implementare;

public class PornesteBanda implements IComanda{
    BandaAlergat executant;

    public PornesteBanda(BandaAlergat executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        executant.porneste();

    }
}
