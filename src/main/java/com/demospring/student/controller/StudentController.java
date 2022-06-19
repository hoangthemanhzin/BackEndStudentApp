package com.demospring.student.controller;

import java.util.List;
import com.demospring.student.Service.StudentService;
import com.demospring.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    //mapping http://localhost:8080/student/add
    @PostMapping("add")
    public String addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new Student added";
    }

    //mapping http://localhost:8080/student/getAll
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

}
