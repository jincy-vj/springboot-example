package com.example.spring.controller;

import com.example.spring.entity.Product;
import com.example.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Integer id){
            return productService.findById(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        return productService.delete(id);
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<Product> findProductByName(@PathVariable String name){
        return productService.findByName(name);
    }

}
