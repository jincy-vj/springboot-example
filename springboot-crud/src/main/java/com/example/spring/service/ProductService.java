package com.example.spring.service;

import com.example.spring.entity.Product;
import com.example.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return  productRepository.save(product);
    }
    public ResponseEntity<Product> findById(Integer id){
        Optional<Product> product= productRepository.findById(id);
        return product.map(product1 ->
                ResponseEntity.ok().body(product1)).orElse
                (ResponseEntity.notFound().build());

    }
    public ResponseEntity<Product> findByName(String name){
        Product product=productRepository.findByName(name);
        return ResponseEntity.ok().body(product) ;
    }
    public ResponseEntity<?> delete(Integer id){
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
