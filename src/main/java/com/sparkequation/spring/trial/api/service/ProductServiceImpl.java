package com.sparkequation.spring.trial.api.service;

import com.sparkequation.spring.trial.api.model.Product;
import com.sparkequation.spring.trial.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> GetProducts() {
        return productRepository.findAll();
    }
}
