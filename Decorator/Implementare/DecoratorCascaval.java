package Decorator.Implementare;

public class DecoratorCascaval extends ADecoratorBurger{

    public DecoratorCascaval(ABurger burger) {
        super(burger);
    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ", cascaval";
    }

    @Override
    public int getPret() {
        return super.getPret() + 4;
    }
}
