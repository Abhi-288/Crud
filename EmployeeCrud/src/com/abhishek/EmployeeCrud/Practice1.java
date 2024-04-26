package com.abhishek.EmployeeCrud;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
 class Practice {
    Connection con;
        public void create1(Employee emp){
            con=DB_Connection.createDB_Connection();
            String query="insert into empoyee values(?,?,?,?)";
            try {
                PreparedStatement psvm = con.prepareStatement(query);
                psvm.setInt(1,emp.getId());
                psvm.setInt(1,emp.getId());
                psvm.setString(2,emp.getName());
                psvm.setDouble(3,emp.getSalary());
                psvm.setInt(4,emp.getAge());
                int count = psvm.executeUpdate();
                if(count!=0){
                    System.out.println("Employee added successfully");
                }

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public class Practice1{
    public static void main(String []args){
        Practice obj= new Practice();
        Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id:");
       int id=sc.nextInt();
        System.out.println("Enter Name:");
       String name=sc.next();
        System.out.println("Enter Salary");
        int salary=sc.nextInt();
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setAge(age);

        Dao.createEmployee(emp);

        }
}

