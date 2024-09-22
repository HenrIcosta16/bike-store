package com.example.bikestore.service;

import com.example.bikestore.model.Order;
import com.example.bikestore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    public Iterable<Order> findAll() {
        return orderRepository.findAll(); // Corrigido
    }

    public void deleteById(String id) {
        orderRepository.deleteById(id);
    }
}
