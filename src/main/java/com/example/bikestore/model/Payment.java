package com.example.bikestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "payments")
public class Payment {

    @Id
    private String id;
    private String orderId;
    private double amount;
    private String paymentDate;
    private String paymentMethod;
}
