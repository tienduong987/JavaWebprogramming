/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Administrator
 */
public class EmployeeManager extends Manager{

    private static final int MAX = 20;
    
    public EmployeeManager() {
        this.list = new Employee[MAX];
    }
    
    @Override
    public void add() {
        Employee s = new Employee();
        s.input();
        this.list[this.curr] = s;
        this.curr++;
    }

    @Override
    public void search(String name) {
        System.out.println("----RESULT----");
        boolean check = false;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) continue;
            
            if (this.list[i].getName().equals(name)) {
                System.out.println(this.list[i]);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found!!!");
        }
    }

    @Override
    public void show() {
        System.out.println("----LIST----");
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) continue;
            System.out.println(this.list[i]);
        }
    }
    
}
