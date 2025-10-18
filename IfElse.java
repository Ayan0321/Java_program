/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro25;

/**
 *
 * @author ayank
 */
public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        
        if(a>=b && a>=c && a>=d){
            System.out.println("a is greater");
        }
        else if(b>=c && b>=d){
            System.out.println("b is greater");
        }
        else if(c>=d){
            System.out.println("c is greater");
        }
        else{
            System.out.println("d is greater");
        }
    }
    
}
