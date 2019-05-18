package behavioural.visitor;

public class ShoppingListVisitor implements ICartVisitor {

    @Override
    public void visit(Cart cart) {
        System.out.println("\nShopping cart: " + cart.getCartId());
    }

    @Override
    public void visit(CartItem item) {
        System.out.println(item.getQuantity() + " x " + item.getArticle().getDescription());
    }
}
