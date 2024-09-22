package com.example.bikestore.service;

import com.example.bikestore.model.Payment;
import com.example.bikestore.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Optional<Payment> findById(String id) {
        return paymentRepository.findById(id);
    }

    public Iterable<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public void deleteById(String id) {
        paymentRepository.deleteById(id);
    }
}
