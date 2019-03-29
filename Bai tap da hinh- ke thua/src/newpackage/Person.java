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
public class Person {
    private String ID;
    private String name;

    public Person() {
    }

    public Person(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ID là:");
        ID = sc.nextLine();
        System.out.println(" name là: ");
        name = sc.nextLine();
    }
    
}
