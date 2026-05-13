package Strategy2;

public class Client {
    private String nume;
    private IStrategy2 strategieCurenta;

    public Client(String nume) {
        this.nume = nume;
        this.strategieCurenta = strategieCurenta;
    }

    public void setStrategieCurenta(IStrategy2 strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void VizualizareProiect(){
        if(this.strategieCurenta!=null){
            this.strategieCurenta.vizualizeazaSchita(nume);
        }else{
            System.out.println("nu s-a putut realiza ");
        }
    }
}
