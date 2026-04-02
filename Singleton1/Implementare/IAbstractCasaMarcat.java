package cts.Ciucu.Tudor.as.Singleton1.Implementare;

public interface IAbstractCasaMarcat {
    void consultareStareCurenta();
    void adaugaProdus(AbstractAngajat angajat, String produs);
    void eliminaProdus(AbstractAngajat angajat, String produs);
    void inchidere(AbstractAngajat angajat);
    void deschidere(AbstractAngajat angajat);

}
