package org.example.collegemanagementsystem.Service;


import org.example.collegemanagementsystem.Dtos.DepartmentDto;
import org.example.collegemanagementsystem.Models.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    public Department addDeparment(DepartmentDto departmentDto);

    public Department updateDeparment(DepartmentDto departmentDto);

    public Department getDepartment(int id);

    public List<Department> getAllDepartments();
}
