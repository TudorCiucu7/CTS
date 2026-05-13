package Flyweight;

public class Recomandare implements IRecomandare{
    private String textRecomandare;

    public Recomandare(String textRecomandare) {
        this.textRecomandare = textRecomandare;
    }

    @Override
    public String toString() {
        return "Recomandare{" +
                "textRecomandare='" + textRecomandare + '\'' +
                '}';
    }

    @Override
    public void printare(Reteta reteta) {
        System.out.println("Se printeaza reteta : " + reteta);
        System.out.println("Se printeaza recomandarea :" + textRecomandare);
    }
}
