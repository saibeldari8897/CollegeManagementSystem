package org.example.collegemanagementsystem.ServiceImpl;


import org.aspectj.apache.bcel.classfile.Module;
import org.example.collegemanagementsystem.Dtos.StudentDto;
import org.example.collegemanagementsystem.Models.Department;
import org.example.collegemanagementsystem.Models.Student;
import org.example.collegemanagementsystem.Repositories.DepartmentRepository;
import org.example.collegemanagementsystem.Repositories.StudentRepository;
import org.example.collegemanagementsystem.Service.DepartmentService;
import org.example.collegemanagementsystem.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;

    private DepartmentService departmentService;


    public StudentServiceImpl(StudentRepository studentRepository, DepartmentService departmentService) {
        this.studentRepository = studentRepository;
        this.departmentService = departmentService;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(StudentDto studentDto) {
        Department department=departmentService.getDepartment(studentDto.getDepartmentId());
        if(department!=null){
            Student student = Student.builder()
                    .department(department)
                    .studentName(studentDto.getStudentName())
                    .address(studentDto.getAddress())
                    .city(studentDto.getCity())
                    .build();
            return studentRepository.save(student);
        }
        return null;
    }
}
