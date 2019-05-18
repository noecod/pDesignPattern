package behavioural.visitor;

public interface IVisitable {

    void accept(ICartVisitor visitor);
}
