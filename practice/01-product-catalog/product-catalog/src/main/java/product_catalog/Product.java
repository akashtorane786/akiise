package product_catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private Integer id;

    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal mrp;
    private String unit;
    private Integer stockQuantity;

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public BigDecimal getPrice() { return price; }
    public BigDecimal getMrp() { return mrp; }
    public String getUnit() { return unit; }
    public Integer getStockQuantity() { return stockQuantity; }
}