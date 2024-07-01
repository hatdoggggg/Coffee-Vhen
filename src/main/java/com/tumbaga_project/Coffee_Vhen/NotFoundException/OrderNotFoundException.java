package com.tumbaga_project.Coffee_Vhen.NotFoundException;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id){
        super("Could not found order with " + id);
    }
}

