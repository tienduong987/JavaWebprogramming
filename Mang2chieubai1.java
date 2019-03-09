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
public class Mang2chieubai1 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Nhap ma tran: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("m[%d][%d] = ", i,j);
                matrix[i][j] = sc.nextInt(); 
            }
        }
        for(int i=0;i<3;i++){
            int sum_Row=0;
            for(int j=0;j<3;j++){
                sum_Row += matrix[i][j];
            }
            System.out.printf("Dòng thứ %d có tổng là %d\n", i, sum_Row);
        }
        for(int i=0;i<3;i++){
            int sum_Col=0;
            for(int j=0;j<3;j++){
                sum_Col += matrix[j][i];
            }
            System.out.printf("Cột thứ %d có tổng là %d\n", i, sum_Col);
        }
    }
}
    

