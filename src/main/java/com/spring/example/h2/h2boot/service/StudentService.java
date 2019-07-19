package com.spring.example.h2.h2boot.service;

import com.spring.example.h2.h2boot.datamodel.Student;
import com.spring.example.h2.h2boot.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    studentRepository.findAll().forEach(student -> students.add(student));
    return students;
  }

  public Student getStudentById(int id) {
    return studentRepository.findById(id).get();
  }

  public void saveOrUpdate(Student student) {
    studentRepository.save(student);
  }

  public void delete(int id) {
    studentRepository.deleteById(id);
  }
}
