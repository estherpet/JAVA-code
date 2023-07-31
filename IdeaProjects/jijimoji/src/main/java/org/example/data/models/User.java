package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document("User")
@Data
public class User {
    private  String id;
    private  String username;
    private  String password;
    @CreatedDate
    private LocalDateTime dateRegisterd;
    private  Role userRole;
}
