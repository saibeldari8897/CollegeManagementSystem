package org.example.collegemanagementsystem.Service;


import lombok.Setter;
import org.example.collegemanagementsystem.Dtos.StudentDto;
import org.example.collegemanagementsystem.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public List<Student> getAllStudents();

    public Student addStudent(StudentDto studentDto);
}
