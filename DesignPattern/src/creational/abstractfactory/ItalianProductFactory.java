package creational.abstractfactory;

import creational.abstractfactory.coffee.AbstractCoffee;
import creational.abstractfactory.coffee.CoffeeItalian;
import creational.abstractfactory.pizza.AbstractPizza;
import creational.abstractfactory.pizza.NapoliItalian;
import creational.abstractfactory.pizza.QuattroStagioniItalian;

public class ItalianProductFactory extends AbstractProductFactory {

    @Override
    public final AbstractPizza createQuattroStagioni() {
        return new QuattroStagioniItalian("Quattro Stagioni", 9.50);
    }

    @Override
    public final AbstractPizza createNapoli() {
        return new NapoliItalian("Napoli", 9.00);
    }

    @Override
    public final AbstractCoffee createCoffee() {
        return new CoffeeItalian("Lavazza", 1.00);
    }
}