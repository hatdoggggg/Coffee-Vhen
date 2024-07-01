package com.tumbaga_project.Coffee_Vhen.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tumbaga_project.Coffee_Vhen.Model.OrderItem;
import com.tumbaga_project.Coffee_Vhen.NotFoundException.OrderItemNotFoundException;
import com.tumbaga_project.Coffee_Vhen.Repository.OrderItemRepository;

@RestController
public class OrderItemController{

    OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }

    //http://127.0.0.1:8080/OrderItem
    //Get all Order
    @GetMapping("/OrderItem")
    public List<OrderItem> getOrderItem(){
        return repo.findAll();
    }

    //http://127.0.0.1:8080/OrderItem/2
    @GetMapping("/OrderItem/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new OrderItemNotFoundException(id));
    } 

    //POST ENDPOINT

    //http://127.0.0.1:8080/OrderItem/new
    @PostMapping("/OrderItem/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem){
        repo.save(newOrderItem);
        return "A new OrderItem is added. Yey!";
    }


    //DELETE ENDPOINTS
    //http://127.0.0.1:8080/OrderItem/delete/1
    @DeleteMapping("/OrderItem/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        repo.deleteById(id);
        return "OrderItem is deleted";
    }
    }
