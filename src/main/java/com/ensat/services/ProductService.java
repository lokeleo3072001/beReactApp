package com.ensat.services;

import com.ensat.DTO.ProductDTO;
import com.ensat.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDTO> listAllProducts();

    Optional<ProductDTO> getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
