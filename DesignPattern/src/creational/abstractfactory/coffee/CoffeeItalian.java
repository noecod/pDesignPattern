package creational.abstractfactory.coffee;

public class CoffeeItalian extends AbstractCoffee {

    public CoffeeItalian(String name, double price) {
        super(name, price);
    }

    @Override
    public final void brewIt() {
        System.out.println("use italian coffee machine ... brew, serve");
    }
}