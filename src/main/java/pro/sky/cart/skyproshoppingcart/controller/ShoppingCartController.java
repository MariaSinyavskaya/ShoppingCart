package pro.sky.cart.skyproshoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cart.skyproshoppingcart.service.ShoppingCartServiceImpl;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class ShoppingCartController {
    private final ShoppingCartServiceImpl shoppingCartServiceImpl;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @GetMapping(path = "/add")
    public List<Integer> addItemToCart(@RequestParam("ids") List<Integer> ids) {
        return shoppingCartServiceImpl.addItemToCart(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> getAllItemsFromCart() {
        return shoppingCartServiceImpl.getAllItemsFromCart();
    }
}
