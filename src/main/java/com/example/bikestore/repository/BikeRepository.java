package com.example.bikestore.repository;

import com.example.bikestore.model.Bike;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BikeRepository extends ElasticsearchRepository<Bike, String> {
}
