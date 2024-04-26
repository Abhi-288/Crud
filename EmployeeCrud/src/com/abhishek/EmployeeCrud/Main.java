package com.abhishek.EmployeeCrud;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int id;
        String name;

        EmployeeDaoInterface Dao= new EmployeeDaoImplement();

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Employee Management System");
        do{
            System.out.println("1. Add Employee\n" +
                    "2. Show all Employee\n"  +
                    "3. Show Employee Based on Id\n" +
                    "4. Update the employee\n" +
                    "5. Delete the employee\n" +
                    "6. Exit The Application\n");
            System.out.println("Enter your Choice: ");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter the Id:");
                    id=sc.nextInt();
                    System.out.println("Enter Name:");
                     name=sc.next();
                    System.out.println("Enter Salary");
                    int salary=sc.nextInt();
                    System.out.println("Enter Age:");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);

                    Dao.createEmployee(emp);
                    break;
                case 2:

                    Dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter id of the Employee:");
                    int empId=sc.nextInt();
                    Dao.showEmployeeBasedOnId(empId);
                    break;
                case 4:
                    System.out.println("Enter id:");
                    id=sc.nextInt();
                    System.out.println("Enter new name:");
                    name=sc.next();
                    Dao.updateEmployee(id,name);
                    break;
                case 5:
                    System.out.println("Enter the Id of Employee");
                    id=sc.nextInt();
                    Dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thankyou for using our Application...");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid Choice!");
                    break;
            }

        }while(true);


    }
}
