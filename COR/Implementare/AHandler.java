package COR.Implementare;

public abstract class AHandler {
        public AHandler nextHandler;

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void ProcesareComanda(Comanda comanda);
}
