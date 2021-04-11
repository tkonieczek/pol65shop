package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import p.sda.shop.model.CartItem;
import p.sda.shop.model.Knight;
import p.sda.shop.model.Product;
import p.sda.shop.services.ProductService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String getProducts(Model model) {
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("allProducts", allProducts);
        return "products_list";
    }

    //TODO analigicznie jak lista zrobic pobieranie jednego produktu z bazy przy pomocy ProducService i product DAO
    @GetMapping("/{productId}")
    public String getProductDetails(Model model, @PathVariable String productId) {
        // oblsuzyc wyjatek jesli productId w urlu to nie będzie liczba
        int id = Integer.parseInt(productId);
        // obsluzyc sytuacje w ktorej nie znajdziemy produktu o podanym id
        List<Product> products = productService.getAllProducts();
        for (Product pr : products) {
            if(pr.getId() == id) {
                model.addAttribute("product", pr);
                CartItem o = new CartItem();
                o.setProductName(pr.getName());
                o.setProductId(pr.getId());
                model.addAttribute("cartItem", o);
            }
        }
        return "product_details";
    }

    @GetMapping("/newproduct")
    public String getProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "new_product_form";
    }

    //TODO analigicznie jak lista zrobic dodawanie jednego produktu z bazy przy pomocy ProducService i product DAO
    @PostMapping("/newproduct")
    public String addNewProduct(Product product) {
        productService.addNewProduct(product);
        return "redirect:/products/list";
    }

    //TODO analigicznie jak lista zrobic usuwanie jednego produktu z bazy przy pomocy ProducService i product DAO

}
