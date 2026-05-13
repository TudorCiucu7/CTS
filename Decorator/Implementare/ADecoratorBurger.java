package Decorator.Implementare;

public  abstract class ADecoratorBurger extends ABurger {
    protected ABurger burger;

    public ADecoratorBurger(ABurger burger) {
        this.burger = burger;
    }

    @Override
    public String getIngrediente() {
        return burger.getIngrediente();
    }

    @Override
    public int getPret() {
        return burger.getPret();
    }
}
