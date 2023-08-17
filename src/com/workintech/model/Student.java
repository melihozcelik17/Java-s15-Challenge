package com.workintech.model;

public class Student extends Member {
    private String  title;

    public Student(int idNum, String memberName, Number memberContact, String memberType, String title) {
        super(idNum, memberName, memberContact, memberType);
        this.title = title;
    }

}
