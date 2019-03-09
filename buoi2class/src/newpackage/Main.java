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
     public static void main(String[] args){
        Nhanvien nv = new Nhanvien();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            nv.InputInfo();
            nv.printInfo();
            System.out.printf("Tiền thưởng: %f\n",this.tienThuong);
}
    }
}
