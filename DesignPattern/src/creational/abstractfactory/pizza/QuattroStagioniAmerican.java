package creational.abstractfactory.pizza;

import creational.abstractfactory.pizza.AbstractPizza;

public class QuattroStagioniAmerican extends AbstractPizza {

    public QuattroStagioniAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out
                .println("add funghis, tomatoes, anchovis, mozarella, prociutto, oives, ... and cook in electric oven");
    }
}