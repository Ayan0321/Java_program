/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Count Occurrence of a Digit
//Write a program to count how many times a given digit appears in a number.
//Input: Number = 122312, Digit = 2
//Output: 3

package com.mycompany.pro25;
import java.util.Scanner;
 
public class CountNo {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter A number :");
        int n = s.nextInt();
        System.out.println("Enter a digit you count :");
        int d = s.nextInt();
        
        int m = n;
        int i = 0;
        int count = 0  ;
        
        while(n!=0){
            i = n % 10;
            n = n / 10;
             
                if (i==d){
                    count++;
                }
        }
        System.out.println(m+" Contain "+d+" digit "+count+" times");
    }
    
}
