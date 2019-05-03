package newpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CustomerManager {

    private String dir = "cust.dat";
    private List<Customer> list;

    public CustomerManager() {
        this.list = new ArrayList<>();
    }

    public boolean load(String file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = data;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void add() {
        //TODO
        //1. Nhap du lieu
        //2. Them du lieu vao trong list
        Scanner input = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.print("ID > ");
        cus.setId(Integer.parseInt(input.nextLine()));
        System.out.print("Name > ");
        cus.setName(input.nextLine());
        System.out.print("Address > ");
        cus.setAddress(input.nextLine());
        System.out.print("Age > ");
        cus.setAge(Integer.parseInt(input.nextLine()));

        this.list.add(cus);
    }

    public Customer search(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
//        int index = this.list.indexOf(new Customer(id));
//        if (index >= 0) return this.list.get(index);
        return null;
    }

    public boolean save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;    
        }
        return true;
    }
}