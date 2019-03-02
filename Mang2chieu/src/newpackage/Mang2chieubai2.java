
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
public class Mang2chieubai2 {
    public static void main(String[]args){
       int[] phantu =new int[5];
       int a = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so a:");
       for(int i=0;i<5;i++){
           phantu[i]= sc.nextInt();
       }
       a= sc.nextInt();
       boolean check =false;
       for(int i=0;i<5;i++){
           if(phantu[i]== a){
               check =true;
               System.out.println(i);
               break;
           } if(check==false)
           {System.out.println("khong co gia tri a");
       }
    }  
    }
}
