/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.icbt.my.web.service.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author icbt
 */
@Path("/students")
public class StudentResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudent(){
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("ST01", "John Smith", 3.3));
        students.add(new Student("ST02", "George Whey", 3.8));
        
        Gson gson = new GsonBuilder().create();
        return  gson.toJson(students);
    }
}
