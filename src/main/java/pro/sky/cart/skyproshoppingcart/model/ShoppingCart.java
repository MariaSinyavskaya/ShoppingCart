package pro.sky.cart.skyproshoppingcart.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Objects;

@Repository
@SessionScope
public class ShoppingCart {
    private final List<Integer> ids;

    public ShoppingCart(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getIds() {
        return ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "ids=" + ids +
                '}';
    }
}
