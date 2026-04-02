package cts.Ciucu.Tudor.as.Builder1.Implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {


    private TipPantof tipPantof;
    private String materialBaza;
    private int nrPantof;
    private double dimensiuneToc;
    private String materialSecundar;
    private List<String> listamesaje;

    //CONSTR PRIVAT NEAP


    private Pantof(TipPantof tipPantof, List<String> listamesaje, double dimensiuneToc, String materialSecundar, int nrPantof, String materialBaza) {
        this.tipPantof = tipPantof;
        this.listamesaje = listamesaje;
        this.dimensiuneToc = dimensiuneToc;
        this.materialSecundar = materialSecundar;
        this.nrPantof = nrPantof;
        this.materialBaza = materialBaza;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", materialBaza='" + materialBaza + '\'' +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", mesaje=" + listamesaje +
                '}';
    }

    public static PantofBuilder getBuilder(TipPantof tipPantof,String materialBaza,int nrPantof,double dimensiuneToc){
        return new PantofBuilder(tipPantof, dimensiuneToc, nrPantof, materialBaza);
    }



    //STATIC INNER CLASS

    public static class PantofBuilder implements IBuilder {
        private TipPantof tipPantof;
        private String materialBaza;
        private int nrPantof;
        private double dimensiuneToc;
        private String materialSecundar;
        private List<String> listamesaje;

        public PantofBuilder(TipPantof tipPantof, double dimensiuneToc, int nrPantof, String materialBaza) {
            this.tipPantof = tipPantof;
            this.dimensiuneToc = dimensiuneToc;
            this.nrPantof = nrPantof;
            this.materialBaza = materialBaza;
        }
        //setters pt zona optionala

        public PantofBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar;
            return this;
        }

        public PantofBuilder addMesaj(String mesaj) {
            if (this.listamesaje == null) {
                this.listamesaje = new ArrayList<>();
            }
            this.listamesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            if (nrPantof < 35 || nrPantof > 45) {
                System.out.println("Nr pantof gresit");
            }
            if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
                throw new RuntimeException("Dimensiune toc gresita!");
            }
            if (this.listamesaje != null) {
                int suma = 0;
                for (String mesaj : this.listamesaje) {
                    suma += mesaj.length();
                }
                if (suma > nrPantof) {
                    throw new RuntimeException("Prea multe mesaje sau Mesajul este prea lung!");
                }
                //    private Pantof(TipPantof tipPantof, List<String> mesaje, double dimensiuneToc, String materialSecundar, int nrPantof, String materialBaza) {



            }
            return new Pantof(tipPantof, listamesaje,dimensiuneToc,materialSecundar,nrPantof,materialBaza );
        }
    }












}
