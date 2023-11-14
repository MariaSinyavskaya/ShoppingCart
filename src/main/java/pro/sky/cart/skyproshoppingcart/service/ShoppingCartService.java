package pro.sky.cart.skyproshoppingcart.service;

import java.util.List;

public interface ShoppingCartService {
    List<Integer> addItemToCart(List<Integer> ids);
    List<Integer> getAllItemsFromCart();
}
