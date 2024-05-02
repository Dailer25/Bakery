package com.pana.pana.Repositories;

import com.pana.pana.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    Product findById(long id);
}
