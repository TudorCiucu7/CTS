package Observer2.Program;

import Observer2.Implementare.Client;
import Observer2.Implementare.IObservator;
import Observer2.Implementare.PolitiaRomana;

public class Main {
    public static void main(String[] args) {
        IObservator obs1 = new Client("Ion");
        IObservator obs2 = new Client("Andrei");
        IObservator obs3 = new Client("Popescu");

        PolitiaRomana politiaRomana = new PolitiaRomana("Politia Romana",4);

        politiaRomana.producereCaz("A cazut copac pe masina", 10);

        politiaRomana.abonareServiciu(obs1);
        politiaRomana.abonareServiciu(obs2);

        politiaRomana.producereCaz("Furtuna puternica, stai acasa!",10);

        politiaRomana.producereCaz("A evadat Gigel din puscarie.", 3);

        politiaRomana.dezabonareServiciu(obs2);

        politiaRomana.producereCaz("A evadat Gigel2 din puscarie", 6);

    }
}