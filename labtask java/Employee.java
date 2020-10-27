package com.company;
import java.util.Scanner;
public class Employee {


    private  int id;
    private  String name;
    private  int type_of_employee;
    private  double Salary;


    public  Employee( int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName()
    {
        return  name;
    }

    public void setSalary(double salary) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of hours per week");
        int a= sc.nextInt();



        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }
}
