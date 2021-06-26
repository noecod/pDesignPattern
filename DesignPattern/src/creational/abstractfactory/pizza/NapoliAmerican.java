package creational.abstractfactory.pizza;

public class NapoliAmerican extends AbstractPizza {

    public NapoliAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add tomatoes, mozzarella, prosciutto, olives, ... and cook in electric oven");
    }
}