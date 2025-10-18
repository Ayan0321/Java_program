/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            System.out.println("Enter 3 digit No :");
            int n = s.nextInt();
             
                int rev = n;
                int sum=0;
            for(; n!=0;){
                int r;
                r=n%10;
                n=n/10;
                sum = sum +(int) Math.pow(r, 3);
                
            }
            if(rev == sum){
                 System.out.println(rev+" is Armstrong No");
            }
            else{
                System.out.println(rev+" is not Armstrong NO");
            }
                
            
            
            
                
        
    }
    
}
