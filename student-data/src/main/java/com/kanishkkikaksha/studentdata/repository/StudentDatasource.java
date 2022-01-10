package com.kanishkkikaksha.studentdata.repository;

import com.kanishkkikaksha.studentdata.model.Student;

import java.util.List;

public interface StudentDatasource {

    List<Student> retrieveStudents();
    Student retrieveStudent(int rollNumber);
}
