package com.example.spring.repository;

import com.example.spring.dto.CustomerOrderResponse;
import com.example.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRespository extends JpaRepository<Customer,Integer> {

    @Query("select new com.example.spring.dto.CustomerOrderResponse(c.id, p.name) from Customer c join c.products p")
    public List<CustomerOrderResponse> getOrderDetails();
}
