package behavioural.visitor;

public class Demo {

    private static long articleId = 0;

    private static CartItem createCartItem(Article article, int quantity) {
        CartItem item = new CartItem();
        item.setArticle(article);
        item.setQuantity(quantity);
        return item;
    }

    private static Cart createAndFillCart(String cartName) {
        Cart cart = new Cart();
        cart.setCartId(cartName);
        cart.getItems().add(createCartItem(new Article(articleId++, "mars bar", 1.35F), 5));
        cart.getItems().add(createCartItem(new Article(articleId++, "milky way bar", 1.20F), 15));
        cart.getItems().add(createCartItem(new Article(articleId++, "beer", 2.70F), 6));
        return cart;
    }

    public static void main(String[] args) {
        Cart cart = createAndFillCart("Tom's Cart");

        ICartVisitor visitor = new ShoppingListVisitor();
        cart.accept(visitor);

        CountNoOfItemsVisitor noOfItemsVisitor = new CountNoOfItemsVisitor();
        cart.accept(noOfItemsVisitor);
        System.out.println("Total sum: " + noOfItemsVisitor.getSum());

        TotalAmountVisitor totalAmountVisitor = new TotalAmountVisitor();
        cart.accept(totalAmountVisitor);
        System.out.println("Total amount: " + totalAmountVisitor.getTotalAmount());
    }
}
