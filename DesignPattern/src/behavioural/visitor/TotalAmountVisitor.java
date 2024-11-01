package behavioural.visitor;

import lombok.Getter;

/**
 * Calculates to total amount to pay.
 */
@Getter
public class TotalAmountVisitor implements ICartVisitor {

    private float totalAmount = 0F;

    @Override
    public void visit(Cart cart) {
        System.out.println("\nTotal amount to pay of cart: " + cart.getCartId());
    }

    @Override
    public void visit(CartItem item) {
        totalAmount = totalAmount + item.getQuantity() * item.getArticle().getPrice();
        System.out.println("Add article " + item.getArticle().getDescription() + " with quantity " +
                           item.getQuantity() + " and price " + item.getArticle().getPrice() +
                           " => partial amount: " + totalAmount);
    }
}
