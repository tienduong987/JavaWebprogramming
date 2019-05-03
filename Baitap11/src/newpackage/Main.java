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
        Scanner input = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();

        while (true) {
            System.out.println("1. Load");
            System.out.println("2. Add");
            System.out.println("3. Save");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Choose ? ");
            int c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:
                    System.out.print("File Path > ");
                    String path = input.nextLine();
                    if (manager.load(path)) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if (manager.save()) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.print("Id > ");
                    int id = Integer.parseInt(input.nextLine());
                    Customer cust = manager.search(id);
                    if (cust != null) {
                        System.out.println(cust);
                    } else {
                        System.out.println("NOT FOUND");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        }
    }

}


