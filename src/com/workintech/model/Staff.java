package com.workintech.model;

public class Staff extends Member{
    private String name;

    public Staff(int idNum, String memberName, Number memberContact, String memberType) {
        super(idNum, memberName, memberContact, memberType);
    }
}
