package com.workintech.model;

import java.util.ArrayList;

public class Member {
    private int memberID;
    private String memberName;
    private Number memberContact;
    private String memberType;
    static int currentIdNumber = 0;     //kişiye özel her kişi oluştuğunda artacak.
    private ArrayList<Book> borrowedBooks; // buraya ödünç alınan kitaplar için arraylist yapıldı.


    public Member(int idNum, String memberName, Number memberContact, String memberType) {
        currentIdNumber++;

        if(idNum==-1)
        {
            memberID= currentIdNumber;
        }
        else
            memberID = idNum;


        this.memberName = memberName;
        this.memberContact = memberContact;
        this.memberType = memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Number getMemberContact() {
        return memberContact;
    }

    public void setMemberContact(Number memberContact) {
        this.memberContact = memberContact;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public static int getCurrentIdNumber() {
        return currentIdNumber;
    }

    public static void setCurrentIdNumber(int currentIdNumber) {
        Member.currentIdNumber = currentIdNumber;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                ", memberContact=" + memberContact +
                ", memberType='" + memberType + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
