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
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Student ? Employee ? (S|E) ");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if (c.toUpperCase().equals("S")) {
            instance = new StudentManager();
        } else if (c.toUpperCase().equals("E")) {
            instance = new EmployeeManager();
        } else {
            System.out.println("Not valid");
        }

        if (instance != null) {
            Menu menu = new Menu(instance);
            menu.display();
        }

    }

}
    

