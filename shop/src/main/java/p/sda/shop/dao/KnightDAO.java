package p.sda.shop.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import p.sda.shop.model.Knight;

import java.util.List;

@Repository
public class KnightDAO {

    JdbcTemplate jdbcTemplate;

    public List<Knight> getAllKnight() {
       // jdbcTemplate.

        return null;
    }
}
