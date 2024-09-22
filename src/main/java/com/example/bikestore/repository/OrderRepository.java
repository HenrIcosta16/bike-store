package com.example.bikestore.repository;

import com.example.bikestore.model.Order;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends ElasticsearchRepository<Order, String> {
}
