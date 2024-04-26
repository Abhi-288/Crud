package com.abhishek.EmployeeCrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImplement implements EmployeeDaoInterface{
    Connection con;
    @Override
    public void createEmployee(Employee emp){
    con= DB_Connection.createDB_Connection();
    String query="insert into empoyee values(?,?,?,?)";
    try{
        PreparedStatement pstm= con.prepareStatement(query);
        pstm.setInt(1,emp.getId());
        pstm.setString(2,emp.getName());
        pstm.setDouble(3, emp.getSalary());
        pstm.setInt(4,emp.getAge());
        int count = pstm.executeUpdate();
        if(count!=0){
            System.out.println("Employee Added Successfully...");
        }
    }
    catch (Exception ex){
        ex.printStackTrace();
        }
    }
    @Override
    public void showAllEmployee(){
        con=DB_Connection.createDB_Connection();
        String query="select * from empoyee";
        System.out.println("--------------------------------------------------------------");
        System.out.print("ID\tNAME\t\tSALARY \t\tAGE\n");
        System.out.println("--------------------------------------------------------------");
        try{
            Statement stmt=con.createStatement();
            ResultSet result=  stmt.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
                System.out.println("--------------------------------------------------------------");
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
    @Override
    public void showEmployeeBasedOnId(int id){
        con=DB_Connection.createDB_Connection();
        String query="select * from empoyee where id="+id;
        try{
            Statement stmt=con.createStatement();
           ResultSet result= stmt.executeQuery(query);
           while(result.next()){
               System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
           }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void updateEmployee(int id, String name){
        con=DB_Connection.createDB_Connection();
        String query="update empoyee set name=? where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
            int count =pstm.executeUpdate();
            if(count!=0){
                System.out.println("Employee Detail Updated Successfully");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
    @Override
    public void deleteEmployee(int id){
        con=DB_Connection.createDB_Connection();
        String query="delete from empoyee where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int count =pstm.executeUpdate();
            if(count!=0){
                System.out.println("Employee detailed deleted Successfully..."+id);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    
}
