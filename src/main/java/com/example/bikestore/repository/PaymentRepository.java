package com.example.bikestore.repository;

import com.example.bikestore.model.Payment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends ElasticsearchRepository<Payment, String> {
}
