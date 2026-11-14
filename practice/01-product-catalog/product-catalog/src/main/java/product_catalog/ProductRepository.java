package product_catalog;

import java.math.BigDecimal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE "
         + "(:categoryId IS NULL OR p.categoryId = :categoryId) AND "
         + "(:maxPrice IS NULL OR p.price <= :maxPrice)")
    Page<Product> search(@Param("categoryId") Integer categoryId,
                         @Param("maxPrice") BigDecimal maxPrice,
                         Pageable pageable);
}