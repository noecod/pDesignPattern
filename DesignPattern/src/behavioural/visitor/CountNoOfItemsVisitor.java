package behavioural.visitor;

import lombok.Getter;

@Getter
public class CountNoOfItemsVisitor implements ICartVisitor {

    private float sum = 0F;

    @Override
    public void visit(Cart cart) {
        System.out.println("\nSum up items of cart: " + cart.getCartId());
    }

    @Override
    public void visit(CartItem item) {
        sum = sum + item.getQuantity();
        System.out.println("Add article " + item.getArticle().getDescription() + " with quantity " +
                item.getQuantity() + " => partial sum: " + sum);
    }
}
