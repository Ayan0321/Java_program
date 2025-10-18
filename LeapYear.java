/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter Year :");
        int y = s.nextInt();
        
        if(y%4==0){
            
            if(y%100==0){
                if(y%400==0){
                    System.out.println(y +" is a leap year.");
                }
                else{
                    System.out.println(y +" is not a leap year.");
                    
                }
            }
            else{
                System.out.println(y +" is a leap year.");
            }
        }
        else{
             System.out.println(y +" is not a leap year.");
        }
    }
    
}
