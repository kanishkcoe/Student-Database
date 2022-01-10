package com.kanishkkikaksha.studentdata.repository.implementation;

import com.kanishkkikaksha.studentdata.model.Student;
import com.kanishkkikaksha.studentdata.repository.StudentDatasource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListDatasource implements StudentDatasource {

    List<Student> studentList = new ArrayList<>();

    public ListDatasource() {
        this.studentList.add(new Student(1, "kanishk"));
        this.studentList.add(new Student(2, "karan"));
        this.studentList.add(new Student(3, "kunal"));
        this.studentList.add(new Student(4, "prateek"));
    }

    @Override
    public List<Student> retrieveStudents() {
        return this.studentList;
    }

    @Override
    public Student retrieveStudent(int rollNumber) {
        for (Student student : studentList) {
            if(student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
