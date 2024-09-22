package com.example.bikestore.service;

import com.example.bikestore.model.Contato;
import com.example.bikestore.repository.ContatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    public Optional<Contato> findById(String id) {
        return contatoRepository.findById(id);
    }

    public Iterable<Contato> findAll() {
        return contatoRepository.findAll();
    }

    public void deleteById(String id) {
        contatoRepository.deleteById(id);
    }
}
