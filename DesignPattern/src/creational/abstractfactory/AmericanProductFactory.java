package creational.abstractfactory;

import creational.abstractfactory.coffee.AbstractCoffee;
import creational.abstractfactory.coffee.CoffeeAmerican;
import creational.abstractfactory.pizza.AbstractPizza;
import creational.abstractfactory.pizza.NapoliAmerican;
import creational.abstractfactory.pizza.QuattroStagioniAmerican;

public class AmericanProductFactory extends AbstractProductFactory {

    @Override
    public final AbstractPizza createQuattroStagioni() {
        return new QuattroStagioniAmerican("Quattro Stagioni", 8.50);
    }

    @Override
    public final AbstractPizza createNapoli() {
        return new NapoliAmerican("Napoli", 7.00);
    }

    @Override
    public final AbstractCoffee createCoffee() {
        return new CoffeeAmerican("Starbucks", 3.00);
    }
}