/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.db.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author icbt
 */
public class DbApp {

    static final String DB_URL = "jdbc:mysql://localhost:3306/icbt";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM students";

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
                    Statement stmt = conn.createStatement(); 
                    ResultSet rs = stmt.executeQuery(QUERY);) {
                while (rs.next()) {
                    //Display values
                    System.out.print("ID: " + rs.getInt("id"));
                    System.out.print(", Name: " + rs.getString("name"));
                    System.out.println(", DOB: " + rs.getString("dob"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }

    }
}
