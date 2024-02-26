package com.ensat.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

/**
 * Product entity.
 */
@Entity
@Data
@NoArgsConstructor
public class Product {
    public Product(String userName, String password, String note, boolean rememberMe, Integer radio, boolean switchForm, String selectOption) {
        this.userName = userName;
        this.password = password;
        this.note = note;
        this.rememberMe = rememberMe;
        this.radio = radio;
        this.switchForm = switchForm;
        this.selectOption = selectOption;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    private String password;
    private String note;
    private boolean rememberMe;
    private Integer radio;
    private boolean switchForm;
    private String selectOption;
}
