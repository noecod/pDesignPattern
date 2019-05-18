package creational.abstractfactory;

public class NapoliAmerican extends AbstractPizza {

    NapoliAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add tomatoes, mozarella, prociutto, oives, ... and cook in electric oven");
    }
}