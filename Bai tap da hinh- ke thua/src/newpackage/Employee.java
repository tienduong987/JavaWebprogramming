/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee extends Person {
    private String salary;

    public Employee() {
    }

    public Employee(String salary, String ID, String name) {
        super(ID, name);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public void input(){
    super.input();
    Scanner sc= new Scanner(System.in);
    System.out.println(" salary la");
    salary= sc.nextLine();
    
}
}