package pro.sky.cart.skyproshoppingcart.service;

import org.springframework.stereotype.Service;
import pro.sky.cart.skyproshoppingcart.model.ShoppingCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> addItemToCart(List<Integer> ids) {
        shoppingCart.getIds().addAll(ids);
        return new ArrayList<>(ids);
    }

    @Override
    public List<Integer> getAllItemsFromCart(){
        return Collections.unmodifiableList(shoppingCart.getIds());
    }
}
