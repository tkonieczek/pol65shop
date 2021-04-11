package p.sda.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import p.sda.shop.model.Knight;
import p.sda.shop.model.Product;

import java.util.List;

@Repository
public class ProductDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

    // Na prace domowa
    // pobranie produktu pod id
    // dodanie produktu
    // usuniecie produktu
}
