package pro.sky.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.service.impl.CartService;


import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add (@RequestParam("id") List<Long> id){
        cartService.add(id);
    }

    @GetMapping("/get")
    public List<Long> get(){
        return cartService.getAll();
    }
}
