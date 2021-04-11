package p.sda.shop.services;

import org.springframework.stereotype.Service;
import p.sda.shop.dao.ProductDAO;
import p.sda.shop.model.Product;

import java.util.List;

//TODO ProductService zrobic jako interfejs  i zrobić dwie implementacje jedna która korzysta z ProductDAo
//TODO a druga która skorzysta ze zrobionego wcześniej ProductRepository
// Interfejs ProdcutService powinien miec takie metoda jak poniższa klasa
@Service
public class ProductService {

    ProductDAO productDAO;

    // wstrzykniecie przez konstruktor
    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
        // jakas logika biznesowa jesli ptrzeba
    }

    // na prace domowa dokonczyc
    public void addNewProduct(Product product) {

    }

    // na prace domowa dokonczyc
    public Product getProductById() {
        return null;
    }
}
