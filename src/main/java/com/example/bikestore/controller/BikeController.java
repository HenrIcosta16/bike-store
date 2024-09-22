package com.example.bikestore.controller;

import com.example.bikestore.model.Bike;
import com.example.bikestore.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    // Método para listar todas as bicicletas (GET)
    @GetMapping
    public ResponseEntity<Iterable<Bike>> getAllBikes() {
        return ResponseEntity.ok(bikeService.findAll());
    }

    // Método para adicionar uma nova bicicleta (POST)
    @PostMapping
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        Bike savedBike = bikeService.save(bike);
        return new ResponseEntity<>(savedBike, HttpStatus.CREATED);
    }

    // Método para obter uma bicicleta por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Bike> getBikeById(@PathVariable String id) {
        Optional<Bike> bike = bikeService.findById(id);
        return bike.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Método para atualizar uma bicicleta existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Bike> updateBike(@PathVariable String id, @RequestBody Bike bike) {
        Optional<Bike> existingBike = bikeService.findById(id);
        if (existingBike.isPresent()) {
            bike.setId(id);  // Garantir que o ID seja mantido
            return ResponseEntity.ok(bikeService.save(bike));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para deletar uma bicicleta por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBike(@PathVariable String id) {
        Optional<Bike> existingBike = bikeService.findById(id);
        if (existingBike.isPresent()) {
            bikeService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
