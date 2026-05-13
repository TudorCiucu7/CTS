package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int id;
    private String diagnostic;
    private List<String> listamedicamente = new ArrayList<>();

    public Reteta(int id, String diagnostic) {
        this.id = id;
        this.diagnostic = diagnostic;
        this.listamedicamente = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getListamedicamente() {
        return listamedicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "id=" + id +
                ", diagnostic='" + diagnostic + '\'' +
                ", listamedicamente=" + listamedicamente +
                '}';
    }
}
