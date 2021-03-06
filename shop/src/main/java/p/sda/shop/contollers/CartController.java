package p.sda.shop.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import p.sda.shop.model.Cart;
import p.sda.shop.model.CartItem;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    Cart cart;

    @GetMapping("/list")
    public String getCartItems(Model model) {
        model.addAttribute("allItems", cart.getItems());
        return "cart";
    }

    //TODO dokonczyc dowawanie do koszyka
    @PostMapping("/add")
    public String addProductToCart(CartItem cartItem) {
        //cart.add(cartItem.get)
        // na pracę domową obowiązkowo
        return "redirect:/products/" + cartItem.getProductId();
    }
}
