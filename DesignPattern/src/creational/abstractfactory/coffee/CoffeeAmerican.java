package creational.abstractfactory.coffee;

public class CoffeeAmerican extends AbstractCoffee {

    public CoffeeAmerican(String name, double price) {
        super(name, price);
    }

    @Override
    public final void brewIt() {
        System.out.println("use american coffee machine, use large cup ... brew, serve");
    }
}