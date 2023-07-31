package org.example.dtos.request;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@Data
public class PostProductRequest {
    private String name;
    private String description;
    private int price;
}