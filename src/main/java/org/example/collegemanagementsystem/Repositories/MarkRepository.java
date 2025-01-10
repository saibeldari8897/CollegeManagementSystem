package org.example.collegemanagementsystem.Repositories;

import org.example.collegemanagementsystem.Models.Mark;
import org.example.collegemanagementsystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Student> {
}
