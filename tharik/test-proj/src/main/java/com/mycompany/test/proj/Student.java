/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.proj;

/**
 *
 * @author icbt
 */
public class Student {
    private String no;
    private String name;
    private String dob;
    private boolean isMale;

    public Student() {
    }

    public Student(String no, String name, String dob, boolean isMale) {
        this.no = no;
        this.name = name;
        this.dob = dob;
        this.isMale = isMale;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    
    
}
