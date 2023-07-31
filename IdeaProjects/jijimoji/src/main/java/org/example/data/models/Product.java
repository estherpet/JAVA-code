package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("Product")
public class Product {
    @Id
    private  String id;
    private  String name;
    private  String description;
    @CreatedDate
    private LocalDateTime dateCreated;
    private int price;
}
