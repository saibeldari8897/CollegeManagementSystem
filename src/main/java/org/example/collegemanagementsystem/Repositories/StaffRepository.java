package org.example.collegemanagementsystem.Repositories;

import org.example.collegemanagementsystem.Models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
