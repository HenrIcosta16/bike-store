package com.example.bikestore.service;

import com.example.bikestore.model.Bike;
import com.example.bikestore.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    public Bike save(Bike bike) {
        return bikeRepository.save(bike);
    }

    public Optional<Bike> findById(String id) {
        return bikeRepository.findById(id);
    }

    public Iterable<Bike> findAll() {
        return bikeRepository.findAll();
    }

    public void deleteById(String id) {
        bikeRepository.deleteById(id);
    }
}
