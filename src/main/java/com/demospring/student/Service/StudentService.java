package com.demospring.student.Service;

import com.demospring.student.model.Student;

import java.util.List;

public interface StudentService {
    //save Student:
    public Student saveStudent(Student student);
    //read ListStudent:
    public List<Student> getAllStudents();
}
