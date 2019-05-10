/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public abstract class Luyentap {

    public static void main(String[] args) {
        byte buffer[] = new byte[80];
        Try{
        System.out.println("Enter a line to be saved to disk");
        int num = System.in.read(buffer);
        FileOutputStream fos = new FlieOutputStream(e("line.txt");
        fos.write(buffer,0, num);
        fos.close();
    }catch(IOException e){
            System.out.println(e.toString())
            }