package com.ensat.repositories;

import com.ensat.DTO.ProductDTO;
import com.ensat.entities.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT " +
            "new com.ensat.DTO.ProductDTO(p.id, p.userName, p.note, p.rememberMe, p.radio, p.switchForm, p.selectOption) " +
            "FROM Product AS p " +
            "order by p.id DESC ")
    List<ProductDTO> getAllProduct();

    @Query(value = "SELECT " +
            "new com.ensat.DTO.ProductDTO(p.id, p.userName, p.note, p.rememberMe, p.radio, p.switchForm, p.selectOption) " +
            "FROM Product AS p WHERE p.id = (:id)")
    Optional<ProductDTO> getProductById(@Param("id") Integer id);

}
