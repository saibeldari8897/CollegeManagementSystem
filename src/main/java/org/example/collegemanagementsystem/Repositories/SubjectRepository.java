package org.example.collegemanagementsystem.Repositories;

import jdk.jfr.Registered;
import org.example.collegemanagementsystem.Models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
