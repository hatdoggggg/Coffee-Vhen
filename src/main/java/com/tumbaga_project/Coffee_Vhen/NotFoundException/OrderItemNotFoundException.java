package com.tumbaga_project.Coffee_Vhen.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Long id){
        super("Could not found OrderItem with " + id);
    }
}

