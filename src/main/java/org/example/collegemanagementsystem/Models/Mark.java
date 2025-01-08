package org.example.collegemanagementsystem.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mark {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    private Student student;

    @Column(nullable=false)
    private int value;

    @OneToOne(cascade = CascadeType.ALL)
    private Subject subject;

}
