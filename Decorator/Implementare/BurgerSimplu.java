package Decorator.Implementare;

public class BurgerSimplu extends ABurger{
    @Override
    public String getIngrediente() {
        return "2 patty de carne, cartofi,ceapa";
    }

    @Override
    public int getPret() {
        return 30;
    }
}
