package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import p.sda.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/list")
    public String getProducts(Model model) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Kawa", "Pyszna kawa", "", 20));
        products.add(new Product(2, "Mleko", "Kwaśne", "", 10));
        products.add(new Product(3, "Samochod", "Zajebiszcze BMW", "", 200020));
        model.addAttribute("allProducts", products);
        return "products_list";
    }

}
