package org.example.collegemanagementsystem.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subjectId;


    @Column(nullable = false)
    private String subjectName;

    @Column(nullable = false)
    private String subjectCode;


    @OneToOne(cascade = CascadeType.ALL)
    private Staff staff;

}
