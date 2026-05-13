package Decorator.Program;

import Decorator.Implementare.ABurger;
import Decorator.Implementare.BurgerSimplu;
import Decorator.Implementare.DecoratorBacon;
import Decorator.Implementare.DecoratorCascaval;

public class Main {
    public static void main(String[] args) {
        ABurger burger = new BurgerSimplu();

        ABurger burgerDecorat = new DecoratorBacon(burger);
        burgerDecorat = new DecoratorCascaval(burgerDecorat);

        System.out.println(burgerDecorat.getIngrediente());
        System.out.println(burgerDecorat.getPret());
    }
}
