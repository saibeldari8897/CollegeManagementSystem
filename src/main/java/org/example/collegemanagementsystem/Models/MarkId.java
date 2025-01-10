package org.example.collegemanagementsystem.Models;
import java.io.Serializable;
import lombok.Data;

@Data
public class MarkId implements Serializable {
    private Long student; // Match the type of Student's primary key
    private Long subject; // Match the type of Subject's primary key
}