package org.example.collegemanagementsystem.ServiceImpl;


import org.example.collegemanagementsystem.Dtos.StudentDto;
import org.example.collegemanagementsystem.Models.Department;
import org.example.collegemanagementsystem.Models.Student;
import org.example.collegemanagementsystem.Repositories.StudentRepository;
import org.example.collegemanagementsystem.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentName(studentDto.getStudentName());
        student.setAddress(studentDto.getAddress());
        student.setCity(studentDto.getCity());
        student.setDepartment(new Department());
        return studentRepository.save(student);
    }
}
