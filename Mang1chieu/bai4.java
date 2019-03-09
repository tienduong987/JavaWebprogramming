
import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class bai4 {
   public static void main(String[]args){
       Random rd = new Random();
       int[] a= new int[15];
       Scanner sc = new Scanner(System.in);
       System.out.println("Mang 15 phan tu ngau nhien la:");
       int x;
       for(int i=0;i<15;i++){
           int number = rd.nextInt();
                   x=number%100;
                   a[i]=Math.abs(x);
                   System.out.printf(" %d ", a[i]);
       }
       System.out.println();
       int temp;
       System.out.println("Mang duoc sap xep tang dan la:");
       for(int i=0;i<15;i++){
           for(int j=i+1;j<15;j++){
               if(a[i]>a[j]){
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
             }
           }
           System.out.printf(" %d ",a[i]);
       }
       System.out.println();
       System.out.println("Mang duoc sap xep giam dan la:");
       for(int i=0;i<15;i++){
           for(int j=i+1;j<15;j++){
               if(a[i]<a[j]){
                   temp =a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }System.out.printf(" %d ", a[i]);
       }System.out.println();
      int count1=0;
      for(int i=0;i<15;i++){
          if(a[i]%2==0)
              count1++;
                }
      System.out.println("So phan tu chan la: "+count1);
       int count2=0;
       for(int i=0;i<15;i++){
           if(a[i]%2!=0)
               count2++;
       }System.out.println("So phan tu le la: "+count2);
         }
  
   
}