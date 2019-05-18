package behavioural.visitor;

public class Demo {

    private static long articleId = 0;

    private static CartItem createCartItem(String description, float quantity) {
        CartItem item = new CartItem();
        Article article = new Article();
        article.setId(articleId++);
        article.setDescription(description);
        item.setArticle(article);
        item.setQuantity(quantity);
        return item;
    }

    private static Cart createAndFillCart(String cartName) {
        Cart cart = new Cart();
        cart.setCartId(cartName);
        cart.getItems().add(createCartItem("mars bar", 5f));
        cart.getItems().add(createCartItem("milky way bar", 15f));
        cart.getItems().add(createCartItem("beer", 6f));
        return cart;
    }

    public static void main(String[] args) {
        Cart cart = createAndFillCart("Tom's Cart");

        ICartVisitor visitor = new ShoppingListVisitor();
        cart.accept(visitor);

        CountNoOfItemsVisitor noofitemvisitor = new CountNoOfItemsVisitor();
        cart.accept(noofitemvisitor);
        System.out.println("Total sum: "+ noofitemvisitor.getSum());
    }
}
