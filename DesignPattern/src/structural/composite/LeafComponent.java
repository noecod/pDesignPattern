package structural.composite;

public final class LeafComponent extends AbstractComponent {

    public LeafComponent(String name) {
        super(name);
    }

    @Override
    protected void componentPrint() {
        // do nothing, no components
    }
}
