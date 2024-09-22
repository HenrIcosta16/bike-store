package com.example.bikestore.controller;

import com.example.bikestore.model.Contato;
import com.example.bikestore.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping
    public ResponseEntity<Contato> createCustomer(@RequestBody Contato contato) {
        return ResponseEntity.ok(contatoService.save(contato));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> getCustomerById(@PathVariable String id) {
        Optional<Contato> customer = contatoService.findById(id);
        return customer.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<Iterable<Contato>> getAllCustomers() {
        return ResponseEntity.ok(contatoService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contato> updateCustomer(@PathVariable String id, @RequestBody Contato customer) {
        if (contatoService.findById(id).isPresent()) {
            customer.setId(id);
            return ResponseEntity.ok(contatoService.save(customer));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        contatoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
