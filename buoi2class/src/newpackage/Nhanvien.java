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
public class Nhanvien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogio;
     Nhanvien()
    {
        this.ten=" ";
        this.tuoi=0;
        this.diachi="";
        this.tienluong=0;
        this.tongsogio=0;
    }
    public Nhanvien(String ten,int tuoi,String diachi,double tienluong,int tongsogio)
    {
        this.ten=ten;
        this.tuoi=tuoi;
        this.diachi=diachi;
        this.tienluong=tienluong;
        this.tongsogio=tongsogio;
    }
    public void setten(String ten)
    {
        this.ten=ten;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi=tuoi;
    }
    public void setdiachi(String diachi)
    {
        this.diachi=diachi;
           }
    public void settienluong(int tienluong) {
        this.tienluong=tienluong;
    }
    public void settongsogio(int tongsogio){
        this.tongsogio=tongsogio;
    }
    public String getten()
    {
        return ten;
    }
    public int gettuoi()
    {
        return tuoi;
    }
    public String getdiachi()
    {
        return diachi;
    }
    public double gettienluong()
    {
        return tienluong;
    }
    public int gettongsogio()
    {
        return tongsogio;
    }
    public void InputInfo(){
    Scanner sc = new Scanner(System.in);
    System.out.print(" Nhap Ten nhan vien : ");
    ten= sc.nextLine();
    System.out.print("Nhap tuoi :");
    tuoi= Integer.parseInt(sc.nextLine());
    System.out.print("Nhap Dia chi ");
    diachi= sc.nextLine();
    System.out.print("Tien luong :");
    tienluong = sc.nextDouble();
    System.out.print("Tong so gio ");
    tongsogio = sc.nextInt();
    }
    public void printInfo(){
        System.out.println("Ten: "+ten+",tuoi: "+tuoi+",Dia chi : "+diachi+",Tien luong: "+tienluong+",Tong so gio :"+tongsogio+"");
    }
   public double tienThuong(){
       double tienThuong;
          if(tongsogio>=200){
             tienThuong = tienluong*0.2;
          }
          else if(tongsogio <200&& tongsogio>=100){
             tienThuong = tienluong *0.1;
               }
          else
              tienThuong=0;
        return tienThuong;
      }

     
  
   }
   
