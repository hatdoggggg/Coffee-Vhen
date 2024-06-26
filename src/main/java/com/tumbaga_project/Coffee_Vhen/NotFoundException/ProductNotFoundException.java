package com.tumbaga_project.Coffee_Vhen.NotFoundException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id){
        super("Could not found product with " + id);
    }
}
