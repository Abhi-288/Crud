package com.abhishek.EmployeeCrud;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    static Connection con;
public static Connection createDB_Connection(){
    try{
        // Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //get connection
        String url="jdbc:mysql://localhost:3306/employee_db?useSSL=false";
        String username="root";
        String password="bauwaraja@123";
       con= DriverManager.getConnection(url,username,password);
    }
    catch(Exception ex){
      ex.printStackTrace();
    }
    return con;
}
}
