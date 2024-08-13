package com.example.spring.controller;

import com.example.spring.dto.CustomerOrderResponse;
import com.example.spring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<CustomerOrderResponse> getOrderDetails(){
        return orderService.getOrderDetails();
    }

}
