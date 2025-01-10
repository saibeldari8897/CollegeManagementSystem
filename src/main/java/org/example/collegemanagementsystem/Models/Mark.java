package org.example.collegemanagementsystem.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@IdClass(MarkId.class)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mark {
    @Id
    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Id
    @OneToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(nullable = false)
    private int value;
}
