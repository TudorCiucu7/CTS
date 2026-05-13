package Strategy.Implementare;

public class Client {
    private String nume;
    private IStrategy strategieCurenta;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setStrategieCurenta(IStrategy strategieCurenta) {
        this.strategieCurenta = strategieCurenta;

    }
    public void finalizarePlata(float suma){
        if(this.strategieCurenta!=null){
            strategieCurenta.plateste(suma);
            System.out.println("S-a realizat plata de " + suma + " a persoanei : " + nume);
        }else{
            System.out.println("nu e selectata tehnica de plata");
        }
    }
}
