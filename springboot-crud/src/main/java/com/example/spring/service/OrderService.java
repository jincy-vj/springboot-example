package com.example.spring.service;

import com.example.spring.dto.CustomerOrderResponse;
import com.example.spring.repository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRespository orderRespository;

    public List<CustomerOrderResponse> getOrderDetails(){
        return orderRespository.getOrderDetails();
    }
}
