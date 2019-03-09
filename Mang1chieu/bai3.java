
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class bai3 {
    public static void main(String[] args) {
        int[]phantu =new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<phantu.length;i++){
            phantu[i]=sc.nextInt(); 
        }System.out.println("nhap so a: ");
        int a = sc.nextInt();
        boolean check = false;
        for(int i=0;i<phantu.length;i++){
          if (phantu[i]==a )
          {
              check =true;
              System.out.println(i);break;
          }
        }
        if (check== false){
            System.out.println("khong co gia tri a");
            
        }
        
    }
    
}
