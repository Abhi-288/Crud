package com.abhishek.EmployeeCrud;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    // create a default constructor
    public Employee(){

    }

    // creating a constructor
    public Employee(int id,String name, double salary, int age){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    // getter setter for Id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    // getter setter for name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    // getter setter for salary
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    // getter setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
    this.age=age;
    }
    // create a toString function
   @Override
    public String toString(){
        return "Employee{"+ "Id="+ id +",Name="+name +",Salary="+ salary +",Age="+ age+"}";
    }
    
    }
    

    
    


