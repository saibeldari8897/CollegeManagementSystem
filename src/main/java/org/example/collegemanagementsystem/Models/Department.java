package org.example.collegemanagementsystem.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(nullable = false)
    private String departmentName;

    @Column(nullable = false,unique = true)
    private long departmentBlockNumber;

}
