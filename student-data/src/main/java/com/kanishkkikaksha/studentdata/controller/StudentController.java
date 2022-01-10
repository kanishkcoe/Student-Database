package com.kanishkkikaksha.studentdata.controller;

import com.kanishkkikaksha.studentdata.model.Student;
import com.kanishkkikaksha.studentdata.service.StudentService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("students")
    public HttpEntity<?> getStudents() {
        try {
            return new ResponseEntity<List<Student>>(this.service.getStudents(), HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<String>("No student data is present.", HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("students/{roll}")
    public ResponseEntity<Student> getStudent(@PathVariable int roll) {
        return new ResponseEntity<Student>(this.service.getStudent(roll), HttpStatus.OK);
    }


}
