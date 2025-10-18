/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;

public class Palindrome {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        
        System.out.println("Number is : "+ n);
             int i= n;
             
             
         // using for loop;
         
            int rev = 0;
         for(;i!=0;){
             int b ;
             b = i % 10 ;
             i = i/10;
             rev = rev * 10 + b;
         }
            if(rev==n){
                System.out.println(rev+" is palindrome");
            }
            else{
                System.out.println(rev+" not a palindrome");
            }
            
         // using while loop;
         
            int j = n;
            int re = 0;
        while(j!=0){
            
            int c =0;
            c = j % 10;
            j = j / 10;
            re = re * 10 + c;
        }
        
        if(re==n ){
            System.out.println(re+" is palindrome");
        }
        else{
            System.out.println(re +" is not palindrome");
        }
        
        // using do while loop;
        
            int k = n;
            int r = 0;
        do{
            int d ;
            d = k % 10;
            k = k / 10;
            r = r * 10 + d;
        }while(k!=0);
        
        if (r==n ){
            System.out.println(r+" is palindrome");
        }
        else{
            System.out.println(r+" is not palindrome");
        }
         
        
    }
    
}
