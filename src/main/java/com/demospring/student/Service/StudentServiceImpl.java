package com.demospring.student.Service;

import com.demospring.student.model.Student;
import com.demospring.student.storage.StudentStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentStorage studentStorage;

    //Function save Student
    @Override
    public Student saveStudent(Student student) {
        return studentStorage.save(student);
    }
    //Function read student's data

    @Override
    public List<Student> getAllStudents() {
        return studentStorage.findAll();
    }
}
