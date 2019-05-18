package pattern.gof.structural.composite;

public class LeafComponent extends AbstractComponent {

    public LeafComponent(String name) {
        super(name);
    }

    @Override
    protected void componentPrint() {
        // do nothing, no components
    }
}
