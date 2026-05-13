package Command.Implementare;

public class Telecomanda {
    private IComanda comanda1;
    private IComanda comanda2;
    private IComanda comanda3;

    public void setComanda1(IComanda comanda1) {
        this.comanda1 = comanda1;
    }

    public void setComanda2(IComanda comanda2) {
        this.comanda2 = comanda2;
    }

    public void setComanda3(IComanda comanda3) {
        this.comanda3 = comanda3;
    }
    public void apasaButon1(){
        comanda1.executa();
    }
    public void apasaButon2(){
        comanda2.executa();
    }
    public void apasaButon3(){
        comanda3.executa();
    }
}
