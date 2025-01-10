package org.example.collegemanagementsystem.Controllers;


import org.example.collegemanagementsystem.Dtos.StudentDto;
import org.example.collegemanagementsystem.Models.Student;
import org.example.collegemanagementsystem.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }


    @PostMapping("/student/add")
    public ResponseEntity<Student> addStudent(@RequestBody StudentDto studentDto) {
        Student newStudent = studentService.addStudent(studentDto);
        return ResponseEntity.ok(newStudent);
    }
}
