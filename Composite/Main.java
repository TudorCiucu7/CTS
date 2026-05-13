package Composite;

public class Main {
    public static void main(String[] args) {
      INod spital = new NodStructura("spitalElias");


      INod sectieAgitati = new NodStructura("sectieAgitatiElias");
      INod UPU = new NodStructura("UnitatePrimiriUrgente");

      spital.adaugaNod(sectieAgitati);
      spital.adaugaNod(UPU);

      sectieAgitati.adaugaNod(new Salon("salon1",10,true));
      UPU.adaugaNod(new Salon("salonUPUU",34,false));

       System.out.println(spital.getNod(0).getNrTotalCazuri());
       System.out.println(spital.getNod(1).getNrTotalCazuri());


    }
}
