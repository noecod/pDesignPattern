package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * Holds various line items
 */
@Data
public class Cart implements IVisitable {

    private String cartId;
    private List<CartItem> items = new ArrayList<>();

    @Override
    public void accept(ICartVisitor visitor) {
        visitor.visit(this);
        items.stream().forEach(ci -> ci.accept(visitor));
    }
}
