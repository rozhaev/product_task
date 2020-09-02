package com.sparkequation.spring.trial.api.controller;

import com.sparkequation.spring.trial.api.dto.ProductDTO;
import com.sparkequation.spring.trial.api.model.Product;
import com.sparkequation.spring.trial.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.GetProducts());
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(ProductDTO productDTO) {
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(ProductDTO productDTO) {
        return ResponseEntity.ok(productService.updateProduct(productDTO));
    }

    @DeleteMapping
    public ResponseEntity<Long> deleteProduct(int id) {
        boolean isCreated = productService.deleteProduct(id);
        return isCreated ? ResponseEntity.ok() : ResponseEntity.notFound();
    }
}
