/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
 
public class CountOddNo {
    
 
// count of odd  number ;
    public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
        
            System.out.println("Enter any NO :");
            int n = s.nextInt();
            int count = 0;
            int m =n;
        for(int i = 0; n!=0;){
            i = n % 10;
            n = n / 10;
            
                if (i%2!=0){
                    count++;
                }
        }
        System.out.println(m+" Contain "+ count + " Odd No ");
          
        
                
                 
    }
}
    

