package com.tumbaga_project.Coffee_Vhen.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tumbaga_project.Coffee_Vhen.Model.Order;
import com.tumbaga_project.Coffee_Vhen.NotFoundException.OrderNotFoundException;
import com.tumbaga_project.Coffee_Vhen.Repository.OrderRepository;

@RestController
public class OrderController{

    OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    //http://127.0.0.1:8080/order
    //Get all Order
    @GetMapping("/order")
    public List<Order> getOrder(){
        return repo.findAll();
    }

    //http://127.0.0.1:8080/order/2
    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new OrderNotFoundException(id));
    } 

    //POST ENDPOINT

    //http://127.0.0.1:8080/order/new
    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder){
        repo.save(newOrder);
        return "A new order is added. Yey!";
    }


    //DELETE ENDPOINTS
    //http://127.0.0.1:8080/order/delete/1
    @DeleteMapping("/order/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        repo.deleteById(id);
        return "Order is deleted";
    }
    }
