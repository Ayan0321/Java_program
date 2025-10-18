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
public class LoopInJava {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("First no is "+ a + " second no is "+b +" Before swaping");
        
        int c ;
        c=a;
        a=b;
        b=c;
        System.out.println("First no is "+a+" second no is "+b +" After swaping using third variable");
    }
   }
