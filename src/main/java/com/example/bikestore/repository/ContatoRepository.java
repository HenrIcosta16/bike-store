package com.example.bikestore.repository;

import com.example.bikestore.model.Contato;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends ElasticsearchRepository<Contato, String> {
}
