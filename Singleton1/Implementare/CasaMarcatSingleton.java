package cts.Ciucu.Tudor.as.Singleton1.Implementare;

import java.util.ArrayList;
import java.util.List;

public class CasaMarcatSingleton implements IAbstractCasaMarcat{

    private AbstractAngajat angajatCurent;
    private boolean ComandaDeschisa;
    private List<String> produse;


    private CasaMarcatSingleton(){
        produse = new ArrayList<>();
    }

    //facem private static inner class;


    private static class SingletonHelper{
        private static CasaMarcatSingleton INSTANCE =
                new CasaMarcatSingleton();
    }

    public static CasaMarcatSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }


    @Override
    public void consultareStareCurenta() {
        if(!ComandaDeschisa){
            System.out.println("Nu exista comanda deschisa");
        }
        else {
            System.out.println("Comanda curenta este deschisa de catre angajatul" + angajatCurent.getNume());
            System.out.println("Comanda curenta : " + produse);
        }

    }

    @Override
    public void adaugaProdus(AbstractAngajat angajat, String produs) {
        if(!ComandaDeschisa){
            System.out.println("Nu exista comanda deschisa");
        }
        if(angajat == null){
            System.out.println("Nu exista angajat/invalid");
        }
        if(angajat != angajatCurent){
            System.out.println("Angajatul nu coincide cu cel curent");
        }
        if(produse == null || produs.trim().isEmpty() ) {
            System.out.println("Cos gol/invalid");
        }
        produse.add(produs);
    }

    @Override
    public void eliminaProdus(AbstractAngajat angajat, String produs) {
        if(!ComandaDeschisa){
            System.out.println("Nu exista comanda deschisa");
        }
        if(angajat == null){
            System.out.println("Nu exista angajat/invalid");
        }
        if(angajat != angajatCurent){
            System.out.println("Angajatul nu coincide cu cel curent");
        }
        if(produse == null || produs.trim().isEmpty() ) {
            System.out.println("Cos gol/invalid");
        }
        if(!(produse).contains(produs)){
            System.out.println("Cosul nu contine produsul cautat");
        }
        produse.remove(produs);
    }

    @Override
    public void inchidere(AbstractAngajat angajat) {
        if(!ComandaDeschisa){
            System.out.println("Nu exista comanda deschisa");
        }
        if(angajat == null){
            System.out.println("Nu exista angajat/invalid");
        }
        if(angajat != angajatCurent){
            System.out.println("Angajatul nu coincide cu cel curent");
        }
       produse.clear();
        angajatCurent = null;
        ComandaDeschisa = false;
    }

    @Override
    public void deschidere(AbstractAngajat angajat) {
            if(angajat == null){
                System.out.println("Angajatul nu poate  fi null");
            }
            if(ComandaDeschisa){
                System.out.println("Este deja alta comanda deschisa");
            }
            produse.clear();
            angajatCurent = angajat;
            ComandaDeschisa = true;
    }
}
