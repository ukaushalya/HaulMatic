/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

/**
 *
 * @author Kaushi
 */
public class Student {
    
    private int stdentId;
    private String studentName;
    private int studentAge;
    
    public Student(int id,String name, int age){
        this.stdentId =id;
        this.studentName = name;
        this.studentAge = age;
        
    }

    public Student() {
        System.out.println("Sent Details");
    }

    public int getStdentId() {
        return stdentId;
    }

    public void setStdentId(int stdentId) {
        this.stdentId = stdentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    
    
}
