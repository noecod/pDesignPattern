package behavioural.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItem implements IVisitable {

    private Article article;
    private int quantity;

    @Override
    public void accept(ICartVisitor visitor) {
        visitor.visit(this);
    }
}
