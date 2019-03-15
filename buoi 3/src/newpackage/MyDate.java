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
public class MyDate {
    private int date;
    private int month;
    private int year;
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public MyDate(){
        
    }
    public MyDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public void readDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        date = sc.nextInt();
        if(date<=0 || date>31){
            System.out.println("Ngày không hợp lệ. Mời bạn nhập lại!");
            date = sc.nextInt();
        }
        System.out.println("Nhập tháng: ");
        month = sc.nextInt();
        if(month<=0 && month>12){
            System.out.println("Tháng không hợp lệ. Mời bạn nhập lại!");
            month = sc.nextInt();
        }
        System.out.println("Nhập năm: ");
        year = sc.nextInt();
        if(year<=0){
            System.out.println("Năm không hợp lệ. Mời bạn nhập lại!");
            year = sc.nextInt();
        }
    }
    public void printDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập định dạng ngắn/dài? (1/0): ");
        int a = sc.nextInt();
        if(a==1)
            System.out.println(+date +"/" +month +"/" +year);
        else
            System.out.println("Ngày " +date +"tháng " +month +"năm " +year);
    }
    public void sumDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n = sc.nextInt();
        int sum = date+n;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10:
                if(sum>31){
                    
                }
        }
    }
    public boolean testYear(){
        return (year%400==0) || (year%4==0 && year%100!=0);
    }
    
}
