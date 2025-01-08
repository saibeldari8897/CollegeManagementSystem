package org.example.collegemanagementsystem.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;


    @Column(nullable = false)
    private String studentName;


    @Column(nullable = false)
    private String address;


    @Column(nullable = false)
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

}
