package creational.abstractfactory.pizza;

public class NapoliItalian extends AbstractPizza {

    public NapoliItalian(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add tomatoes, mozzarella, prosciutto, olives, ... and cook in wood oven");
    }
}