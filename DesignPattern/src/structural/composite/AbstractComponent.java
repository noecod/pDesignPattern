package structural.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractComponent {

    private static final String INDENT = "   ";

    private final String componentName;
    private int level = 0; // top level

    AbstractComponent(String name) {
        componentName = name;
    }

    public void print() {
        System.out.println(INDENT.repeat(getLevel()) + getComponentName() + " - on Level " + getLevel());
        componentPrint();
    }

    protected abstract void componentPrint();
}