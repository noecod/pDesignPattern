package creational.abstractfactory.pizza;

public abstract class AbstractPizza {

    private String name;
    private double price;

    public AbstractPizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public abstract void cookIt();
}