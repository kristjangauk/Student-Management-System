package com.example.student_management_spring_thymeleaf.repository;

import com.example.student_management_spring_thymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
