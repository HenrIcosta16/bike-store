package com.example.bikestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "orders")
public class Order {

    @Id
    private String id;
    private String customerId;
    private String bikeId;
    private String status;
    private String orderDate;
}
