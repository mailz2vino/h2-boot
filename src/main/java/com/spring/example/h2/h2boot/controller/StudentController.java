package com.spring.example.h2.h2boot.controller;

import com.spring.example.h2.h2boot.datamodel.Student;
import com.spring.example.h2.h2boot.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/getAllStudents")
  @ResponseStatus(HttpStatus.OK)
  public List<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @GetMapping("/students/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Student getStudent(@PathVariable("id") int id) {
    return studentService.getStudentById(id);
  }

  @DeleteMapping("/students/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteStudent(@PathVariable("id") int id) {
    studentService.delete(id);
  }

  @PostMapping("/students")
  @ResponseStatus(HttpStatus.CREATED)
  public int saveStudent(@RequestBody Student student) {
    studentService.saveOrUpdate(student);
    return student.getId();
  }

}
