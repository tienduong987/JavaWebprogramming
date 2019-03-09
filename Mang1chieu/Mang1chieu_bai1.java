
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
public class Mang1chieu_bai1 {
    public static void main (String[]args){
               int[] phantu = new int[5];
               int tong= 0;
               int tongch=0;
               int tongle=0;
               Scanner sc = new Scanner(System.in);
               for(int i=0; i<phantu.length;i++){
                   phantu[i]= sc.nextInt();
               }
               for(int i=0;i<phantu.length;i++){
                   if(phantu[i]%2==0){
                       tongch += phantu[i];
                   }else if(phantu[i]%2!=0){
                       tongle += phantu[i];
                   }
                   tong+=phantu[i];
               }
               System.out.println("Tong cac phan tu la: "+tong);
                System.out.println("Tong cac phan tu chan la: "+tongch);
                 System.out.println("Tong cac phan tu le la: "+tongle);
               }
    }
    

