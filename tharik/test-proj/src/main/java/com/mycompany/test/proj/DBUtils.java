/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.proj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icbt
 */
public class DBUtils {
    List<Student> students = new ArrayList<>();

    public DBUtils() {
    }
    
    public Student getStudent(String no) {
        for(Student st : students) {
            if (st.getNo().equals(no)) {
                return st;
            }
        }
        return null;
    }
    
    public boolean addStudent(Student st) {
        students.add(st);
        return true;
    }
    
    public boolean updateStudent(Student st) {
        for(Student student : students) {
            if (student.getNo().equals(st.getNo())) {
                student.setName(st.getName());
                student.setDob(st.getDob());
                student.setIsMale(st.isIsMale());
                return true;
            }
        }
        return false;
    }
        
    public boolean deleteStudent(String no) {
        
        for(Student st : students) {
            if (st.getNo().equals(no)) {
                students.remove(st);
                return true;
            }
        }
        return false;
    }
}
