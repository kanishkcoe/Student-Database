package com.kanishkkikaksha.studentdata.model;

import java.io.Serializable;

public class Student implements Serializable {

    private int rollNumber;
    private String name;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}
