package behavioural.visitor;

/**
 * Items which can be visited ...
 */
public interface IVisitable {

    /**
     * ... and accepts a visitor
     *
     * @param visitor the visitor
     */
    void accept(ICartVisitor visitor);
}
