package Prototype.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJucator implements Cloneable{
    public String nume;
    public List<String> medicamente;

    public AbstractJucator(String nume) {
        this.nume = nume;
        this.medicamente = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public AbstractJucator setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    public AbstractJucator setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
        return this;
    }

    public AbstractJucator(String nume, List<String> medicamente) {
        this.nume = nume;
        this.medicamente = medicamente;
    }

    @Override
    public AbstractJucator clone() throws CloneNotSupportedException {
        AbstractJucator clona = (AbstractJucator) super.clone();
        clona.medicamente = new ArrayList<>(this.medicamente);
        return clona;
    }
}
