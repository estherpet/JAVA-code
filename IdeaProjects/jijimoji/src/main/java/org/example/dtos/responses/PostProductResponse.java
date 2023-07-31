package org.example.dtos.responses;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@Data
public class PostProductResponse {
    private  String name;
    private  String id;


}
