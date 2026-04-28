package com.example.demo.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.CategorySummaryInfo;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<CategorySummaryInfo> findCategoryAverage(){
        return productRepository.findProductsPriceAverage();
    }





    
}
