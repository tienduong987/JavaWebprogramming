
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
public class Mang1chieu_bai2 {
    public static void main(String[] args) {
        int[] phantu = new int[5];
          Scanner sc = new Scanner(System.in);
        int max = 0;
        int min= 0;
        for(int i=0;i<phantu.length;i++){
            phantu[i]=sc.nextInt();
            if(phantu[i]>max){
                max=phantu[i];
            }else if(phantu[i]<min){
                min = phantu[i];
            }
           }
      
        System.out.println("phan tu lon nhat la: "+max);
        System.out.println("phan tu nho nhat la: "+min);
     
       System.out.println("Phan tu chia het cho 3 la : ");
        for(int i=0;i<phantu.length;i++){
            if(phantu[i]%3==0){
             System.out.println(phantu[i]+ "\t");
            }
 
    }
    }
}
    
   
