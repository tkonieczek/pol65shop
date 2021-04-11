package p.sda.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import p.sda.shop.model.Knight;
import p.sda.shop.model.Product;

public interface KnightRepository extends JpaRepository<Knight, Long> {

}
