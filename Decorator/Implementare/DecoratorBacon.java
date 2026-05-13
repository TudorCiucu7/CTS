package Decorator.Implementare;

public class DecoratorBacon extends ADecoratorBurger{

    public DecoratorBacon(ABurger burger) {
        super(burger);
    }

    @Override
    public String getIngrediente() {
        return super.getIngrediente() + ",bacon";
    }

    @Override
    public int getPret() {
        return super.getPret()+7;
    }
}
