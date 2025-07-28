package behavioural.visitor;

import lombok.Getter;

/**
 * Simply counts all the items.
 */
@Getter
public class CountNoOfItemsVisitor implements ICartVisitor {

    private int sum = 0;

    @Override
    public void visit(Cart cart) {
        System.out.println("\nSum up items of cart: " + cart.getCartId());
    }

    @Override
    public void visit(CartItem item) {
        sum = sum + item.getQuantity();
        System.out.println("Add article '" + item.getArticle().getDescription() + "' with quantity " +
                item.getQuantity() + " => partial sum: " + sum);
    }
}
