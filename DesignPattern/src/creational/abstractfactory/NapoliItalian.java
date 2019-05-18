package creational.abstractfactory;

public class NapoliItalian extends AbstractPizza {

    NapoliItalian(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add tomatoes, mozarella, prociutto, oives, ... and cook in wood oven");
    }
}