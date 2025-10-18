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
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner d = new Scanner(System.in);
        System.out.println("Enter base of plot :");
        int b = d.nextInt();
        System.out.println("Enter height of plot : ");
        int h = d.nextInt();
        float area =  (0.5f * b * h);
        System.out.println("Area of plot : " + area);
        
    }
    
}
