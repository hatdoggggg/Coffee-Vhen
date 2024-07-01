package com.tumbaga_project.Coffee_Vhen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tumbaga_project.Coffee_Vhen.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
