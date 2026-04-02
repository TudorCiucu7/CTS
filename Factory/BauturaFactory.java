package Factory;

//Versiune SimpleFactory(nu e clasa abstracta la baza)


public class BauturaFactory {
    public static IBautura getBautura(TipBautura tip){
        switch (tip){
            case CAFEA -> {
                return new Cafea();
            }
            case CIOCOLATA_CALDA -> {
                return new CiocolataCalda("-", "-");
            }
        }
        return null;
    }

}
