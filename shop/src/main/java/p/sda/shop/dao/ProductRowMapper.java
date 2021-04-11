package p.sda.shop.dao;

import org.springframework.jdbc.core.RowMapper;
import p.sda.shop.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setDescription(rs.getString("description"));
        product.setImage(rs.getString("image"));
        product.setPrice(rs.getInt("price"));
        return product;

    }
}