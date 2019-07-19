package com.spring.example.h2.h2boot.repository;

import com.spring.example.h2.h2boot.datamodel.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
