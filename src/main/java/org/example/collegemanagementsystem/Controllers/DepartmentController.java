package org.example.collegemanagementsystem.Controllers;


import org.example.collegemanagementsystem.Dtos.DepartmentDto;
import org.example.collegemanagementsystem.Models.Department;
import org.example.collegemanagementsystem.Service.DepartmentService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/addDepartment")
    public Department addDepartment(@RequestBody DepartmentDto departmentDto) {
        return departmentService.addDeparment(departmentDto);
    }

    @PutMapping("/updateDepartment")
    public Department updateDepartment(@RequestBody DepartmentDto departmentDto) {
        return departmentService.updateDeparment(departmentDto);
    }

    @GetMapping("/getDepartments")
    public List<Department> getDepartments() {
        return departmentService.getAllDepartments();
    }

}
