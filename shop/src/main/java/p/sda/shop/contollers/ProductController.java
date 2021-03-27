package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import p.sda.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    List<Product> products = new ArrayList<>();

    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product(1, "Kawa", "Pyszna kawa", "", 20));
        products.add(new Product(2, "Mleko", "Kwaśne", "", 10));
        products.add(new Product(3, "Samochod", "Zajebiszcze BMW", "", 200020));

    }

    @GetMapping("/list")
    public String getProducts(Model model) {
        model.addAttribute("allProducts", products);
        return "products_list";
    }

    @GetMapping("/{productId}")
    public String getProductDetails(Model model, @PathVariable String productId) {
        // oblsuzyc wyjatek jesli productId w urlu to nie będzie liczba
        int id = Integer.parseInt(productId);
        // obsluzyc sytuacje w ktorej nie znajdziemy produktu o podanym id
        for (Product pr : products) {
            if(pr.getId() == id) {
                model.addAttribute("product", pr);
            }
        }
        return "product_details";
    }
}
