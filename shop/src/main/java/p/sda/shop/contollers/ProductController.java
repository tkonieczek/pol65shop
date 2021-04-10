package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import p.sda.shop.model.CartItem;
import p.sda.shop.model.Knight;
import p.sda.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    List<Product> products = new ArrayList<>();
    //List<CartItem> cartItems
    public ProductController() {
        products = new ArrayList<>();
        products.add(new Product("Kawa", "Pyszna kawa", "prod_1.png", 20));
        products.add(new Product("Mleko", "Kwaśne", "shoe_1.jpg", 10));
        products.add(new Product("Samochod", "Zajebiszcze BMW", "prod_1.png", 200020));

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
                model.addAttribute("cartItem", new CartItem());
            }
        }
        return "product_details";
    }

    @GetMapping("/newproduct")
    public String getProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "new_product_form";
    }

    @PostMapping("/newproduct")
    public String addNewProduct(Product product) {
        product.setId(Product.ID_GENERATOR++);
        products.add(product);
        return "redirect:/products/list";
    }

}
