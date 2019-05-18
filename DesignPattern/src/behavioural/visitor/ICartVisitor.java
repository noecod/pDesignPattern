package behavioural.visitor;

/**
 * Visitor for a cart.
 */
public interface ICartVisitor {

    void visit(Cart cart);

    void visit(CartItem cartItem);
}
