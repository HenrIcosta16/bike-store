package com.example.bikestore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "bikes")
public class Bike {

    @Id
    private String id;
    private String name;
    private String brand;
    private double price;
}
