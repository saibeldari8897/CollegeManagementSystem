package org.example.collegemanagementsystem.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long staffId;

    @Column(nullable = false)
    private String staffName;


    @OneToOne(cascade = CascadeType.ALL)
    private Department department;


}
