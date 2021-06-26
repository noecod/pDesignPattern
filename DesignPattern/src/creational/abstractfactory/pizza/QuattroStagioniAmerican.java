package creational.abstractfactory.pizza;

public class QuattroStagioniAmerican extends AbstractPizza {

    public QuattroStagioniAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out
                .println("add funghis, tomatoes, anchovis, mozzarella, prosciutto, olives, ... and cook in electric oven");
    }
}