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

  public class PhanSo {
    private int numerator;
    private int denominator;
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int tuSo){
        this.numerator = tuSo;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int mauSo){
        this.denominator = mauSo;
    }
    public PhanSo(){
        
    }
    public PhanSo(int numerator, int denominator){
        numerator = numerator;
        denominator = denominator;
    }
    Scanner sc = new Scanner(System.in);
    public void readFraction(){
        System.out.println("Nhập tử số: ");
        numerator = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        denominator = sc.nextInt();
    }
    public void printFraction(){
        System.out.println("Tử số: " +numerator);
        System.out.println("Mẫu số: " +denominator);
    }
    private int gcd(int a, int b) 
    { 
        while(a!=b){
            if(a>b)
                a -= b;
            else
                b -= a;
        }
        return a;
    } 
    public void reduce()  
    { 
        int gcd=this.gcd(numerator,denominator); 
        this.numerator = this.numerator/gcd; 
        this.denominator = this.denominator/gcd; 
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo fr = new PhanSo();
        fr.readFraction();
        fr.printFraction();
        fr.reduce();
        System.out.println("Phân số sau khi rút gọn:");
        fr.printFraction();
    }

}
