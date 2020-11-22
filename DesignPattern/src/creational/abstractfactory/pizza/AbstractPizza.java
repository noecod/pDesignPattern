package creational.abstractfactory.pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractPizza {

    private String name;
    private double price;

    public abstract void cookIt();
}