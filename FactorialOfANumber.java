/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
            System.out.println("Enter a number :");
            int n = s.nextInt();
           
         // using for loop;   
            int sum = 1;
            
        for(int i=1; i<=n;i++){
            sum*=i;
        }
        
            System.out.println("factorial of "+ n +" is "+ sum);
            
        // using while loop;
            int j = 1;
            int sum1 = 1;
        while(j<=n){
            
            sum1*=j;
            j++;
        }
        
            System.out.println("factorial of "+n+ " is "+sum1);
         
        // using do while looop;
            int k = 1;
            int sum2 = 1;
        
        do{
            sum2*=k;
            k++;
            
        }while(k<=n);
        
        System.out.println("factorial of "+n+ " is "+sum2);
        
            
    }
}
