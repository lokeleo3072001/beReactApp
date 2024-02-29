package com.ensat.services;

import com.ensat.DTO.ProductDTO;
import com.ensat.entities.Product;
import com.ensat.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Product service implement.
 */
@Service
public class ProductServiceImpl implements ProductService {
     @Autowired
     private ProductRepository productRepository;

    public List<ProductDTO> listAllProducts() {
        return productRepository.getAllProduct();
    }

    @Override
    public Optional<ProductDTO> getProductById(Integer id) {
        return productRepository.getProductById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
