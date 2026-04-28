package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Product;
import com.example.demo.dtos.CategorySummaryInfo;

public interface ProductRepository extends JpaRepository<Product,Long>{

    
    @Query(
        "select category, avg(price) from Product group by category"
    )
    public List<CategorySummaryInfo> findProductsPriceAverage();
}
