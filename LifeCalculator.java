/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
/**
 *
 * @author ayank
 */
public class LifeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your age : ");
        int y = s.nextInt();
        int d = y * 365;
        int h = d * 24;
        int m = h * 60;
        int se = m * 60;
        
        System.out.println("You've lived approximately :");
        System.out.println("Days : "+ d);
        System.out.println("Hours : "+ h);
        System.out.println("Minutes : "+ m);
        System.out.println("Seconds : "+ se);
        
    }
}
