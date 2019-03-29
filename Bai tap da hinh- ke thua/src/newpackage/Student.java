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
public class Student extends Person {
    private String gmail;

    public Student() {
    }

    public Student(String gmail, String ID, String name) {
        super(ID, name);
        this.gmail = gmail;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("gmail la:");
        gmail= sc.nextLine();
    }

   
}
    
