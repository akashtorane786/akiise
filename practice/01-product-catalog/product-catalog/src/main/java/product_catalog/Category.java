package product_catalog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    private Integer id;

    private String name;

    public Integer getId() { return id; }
    public String getName() { return name; }
}