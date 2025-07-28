package behavioural.visitor;

import java.util.List;

public class Demo {

    private static long articleId = 0;

    private static CartItem createCartItem(long articleId, String articleDescription, float articlePrice,
            int itemQuantity) {
        Article article = new Article(articleId, articleDescription, articlePrice);
        return new CartItem(article, itemQuantity);
    }

    private static Cart createAndFillCart(String cartName) {
        Cart cart = new Cart();
        cart.setCartId(cartName);
        List<CartItem> cartItems = cart.getItems();
        cartItems.add(createCartItem(articleId++, "mars bar", 1.35F, 5));
        cartItems.add(createCartItem(articleId++, "milky way bar", 1.20F, 15));
        cartItems.add(createCartItem(articleId++, "beer", 2.70F, 6));
        return cart;
    }

    public static void main(String[] args) {
        Cart cart = createAndFillCart("Tom's Cart");

        ICartVisitor visitor = new ShoppingListVisitor();
        cart.accept(visitor);

        CountNoOfItemsVisitor noOfItemsVisitor = new CountNoOfItemsVisitor();
        cart.accept(noOfItemsVisitor);
        System.out.println("Total no of articles: " + noOfItemsVisitor.getSum());

        TotalAmountVisitor totalAmountVisitor = new TotalAmountVisitor();
        cart.accept(totalAmountVisitor);
        System.out.println("Total amount: " + totalAmountVisitor.getTotalAmount());
    }
}
