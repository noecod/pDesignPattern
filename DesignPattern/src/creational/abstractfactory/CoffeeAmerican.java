package creational.abstractfactory;

public class CoffeeAmerican extends AbstractCoffee {

    CoffeeAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void brewIt() {
        System.out.println("use american coffee machine, use large cup ... brew, serve");
    }
}