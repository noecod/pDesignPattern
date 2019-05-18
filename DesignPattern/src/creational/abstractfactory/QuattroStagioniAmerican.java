package creational.abstractfactory;

public class QuattroStagioniAmerican extends AbstractPizza {

    QuattroStagioniAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void cookIt() {
        System.out
                .println("add funghis, tomatoes, anchovis, mozarella, prociutto, oives, ... and cook in electric oven");
    }
}