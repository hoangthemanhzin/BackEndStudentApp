package com.demospring.student.storage;

import com.demospring.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentStorage extends JpaRepository<Student,Integer>{
}
