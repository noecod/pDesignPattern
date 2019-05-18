package behavioural.visitor;

import lombok.Data;

@Data
public class CartItem implements IVisitable {

    private Article article;
    private float quantity;

    @Override
    public void accept(ICartVisitor visitor) {
        visitor.visit(this);
    }
}
