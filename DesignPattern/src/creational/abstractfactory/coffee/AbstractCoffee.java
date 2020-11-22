package creational.abstractfactory.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractCoffee {

    private String name;
    private double price;

    public abstract void brewIt();
}