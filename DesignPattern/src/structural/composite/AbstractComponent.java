package structural.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractComponent {

    private String componentName;
    private int level = 0; // top level

    AbstractComponent(String name) {
        componentName = name;
    }

    public void print() {
        System.out.println("   ".repeat(getLevel()) + getComponentName() + " - on Level " + getLevel());
        componentPrint();
    }

    protected abstract void componentPrint();
}