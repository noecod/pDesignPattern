package pattern.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

class CompositeComponent extends AbstractComponent {

    private List<AbstractComponent> includedComponents = new ArrayList<>();

    public CompositeComponent(String name) {
        super(name);
    }

    public void add(AbstractComponent component) {
        component.setLevel(getLevel() + 1);
        includedComponents.add(component);
    }

    @Override
    protected void componentPrint() {
        includedComponents.forEach(c -> c.print());
    }
}
