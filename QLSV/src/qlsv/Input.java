
package qlsv;

import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    
    public String inputId() { // HV000
        String tempId = this.scanner.nextLine();
        try {
   
            if (!tempId.matches("HV[0-9]{3}")) 
                throw new Exception("Phai bat dau bang HV va 3 so");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return tempId;
    }
    
    public String inputName() {
        String tempName = this.scanner.nextLine();
        //Kiem tra dieu kien
        try {
            if (tempName.length() < 3) throw new Exception("Ten phai lon hon 3 ky tu");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return tempName;
    }
    
    public double inputMark() {
        double tempMark = Double.parseDouble(this.scanner.nextLine());
        try { if (10<tempMark.length()>1) throw new Exception("Nhap trong khoang tu 1 den 10");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
        return tempMark;
    }
    
    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
  try {
            if (tempPhone().length() < 9) throw new Exception("Phai nhap so dien thoai tren 9 so");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
         }
        return tempPhone;
    }
            
}
