package com.ensat.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO{

    private Integer id;
    private String userName;
    private String note;
    private boolean rememberMe;
    private Integer radio;
    private boolean switchForm;
    private String selectOption;

}
