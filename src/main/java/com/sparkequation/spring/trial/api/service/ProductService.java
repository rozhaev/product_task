package com.sparkequation.spring.trial.api.service;

import com.sparkequation.spring.trial.api.dto.ProductDTO;
import com.sparkequation.spring.trial.api.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(int id);

    Product createProduct(ProductDTO productDTO);

    Product updateProduct(ProductDTO productDTO);

    boolean deleteProduct(int id);
}
