package com.example.bikestore.controller;

import com.example.bikestore.model.Payment;
import com.example.bikestore.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.save(payment));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable String id) {
        Optional<Payment> payment = paymentService.findById(id);
        
        // Corrigindo a linha que estava incompleta
        return payment.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }
}
