package com.kanishkkikaksha.studentdata.service.implementation;

import com.kanishkkikaksha.studentdata.model.Student;
import com.kanishkkikaksha.studentdata.repository.StudentDatasource;
import com.kanishkkikaksha.studentdata.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDatasource datasource;

    public StudentServiceImpl(StudentDatasource datasource) {
        this.datasource = datasource; // dependency injection
    }

    @Override
    public List<Student> getStudents() {
        return this.datasource.retrieveStudents();
    }

    @Override
    public Student getStudent(int rollNumber) {
        return this.datasource.retrieveStudent(rollNumber);
    }
}
