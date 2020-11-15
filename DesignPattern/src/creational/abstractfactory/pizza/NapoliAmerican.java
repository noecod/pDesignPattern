package creational.abstractfactory.pizza;

import creational.abstractfactory.pizza.AbstractPizza;

public class NapoliAmerican extends AbstractPizza {

    public NapoliAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add tomatoes, mozarella, prociutto, oives, ... and cook in electric oven");
    }
}