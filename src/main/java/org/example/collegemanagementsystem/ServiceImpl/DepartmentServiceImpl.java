package org.example.collegemanagementsystem.ServiceImpl;


import org.example.collegemanagementsystem.Dtos.DepartmentDto;
import org.example.collegemanagementsystem.Models.Department;
import org.example.collegemanagementsystem.Repositories.DepartmentRepository;
import org.example.collegemanagementsystem.Service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartmentServiceImpl implements DepartmentService {



    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department addDeparment(DepartmentDto departmentDto) {
        Department department = Department.builder()
                .departmentName(departmentDto.getDepartmentName())
                .departmentBlockNumber(departmentDto.getDepartmentBlockNumber())
                .build();
        return departmentRepository.save(department);
    }


    @Override
    public Department updateDeparment(DepartmentDto departmentDto) {
        Department department = departmentRepository.findById(departmentDto.getId()).get();
        department.setDepartmentName(departmentDto.getDepartmentName());
        department.setDepartmentBlockNumber(departmentDto.getDepartmentBlockNumber());
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartment(int id){
        Department department = departmentRepository.findById(id).get();
        return department;
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

}
