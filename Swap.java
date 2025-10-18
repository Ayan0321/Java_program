/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
/**
 *
 * @author ayank
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two number :");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("number before swaping is " + a + " "+ b );
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("number after swaping is "+ a + " "+ b);
    }
    
}
