package com.ensat.controllers;

import com.ensat.entities.Product;
import com.ensat.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Homepage controller.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/getAllProduct")
    Iterable<Product> list() {
        return productService.listAllProducts();
    }

    @PostMapping("/saveProduct")
    ResponseEntity<?> saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<?> updateProduct(@RequestParam String userName,
                                           @RequestParam String password,
                                           @RequestParam String note, @RequestParam boolean rememberMe, @RequestParam Integer radio, @RequestParam boolean switchFrom, @RequestParam String selectOption) {
        productService.saveProduct(new Product(userName, password, note, rememberMe, radio, switchFrom, selectOption));
        return ResponseEntity.ok(new Product(userName, password, note, rememberMe, radio, switchFrom, selectOption));
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<?> deleteProduct(@RequestParam Integer id) {
        if (!productService.getProductById(id).isPresent()) {
            return ResponseEntity.ok("Product not found with id: " + id);
        }
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully with id: " + id);
    }

}
