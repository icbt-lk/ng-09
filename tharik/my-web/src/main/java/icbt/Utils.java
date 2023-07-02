package icbt;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author icbt
 */
public class Utils {
    
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("ST01", "John", "Smith", "SE-10"));
        students.add(new Student("ST02", "George", "Whey", "SE-10"));
        students.add(new Student("ST03", "James", "Clark", "SE-10"));
        
        return students;
    }
    
}
