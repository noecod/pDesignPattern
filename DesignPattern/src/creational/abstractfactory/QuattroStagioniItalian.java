package creational.abstractfactory;

public class QuattroStagioniItalian extends AbstractPizza {

    QuattroStagioniItalian(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out.println("add funghis, tomatoes, anchovis, mozarella, prociutto, oives, ... and cook in oven");
    }
}