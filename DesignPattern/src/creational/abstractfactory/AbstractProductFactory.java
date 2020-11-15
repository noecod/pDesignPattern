package creational.abstractfactory;

import creational.abstractfactory.coffee.AbstractCoffee;
import creational.abstractfactory.pizza.AbstractPizza;

public abstract class AbstractProductFactory {

    public abstract AbstractPizza createQuattroStagioni();

    public abstract AbstractPizza createNapoli();

    public abstract AbstractCoffee createCoffee();
}