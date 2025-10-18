/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;

public class ReverseOfNumber {
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter a number :");
        int n = a.nextInt();
        System.out.println("Number is : "+ n);
        
        
        //using while loop;
        
            int rev =0;
            int r =0;
        while(n!=0){
             
            r = n%10;
            n = n/10;
            rev = rev*10 + r;
            
        }
        
        System.out.println("Reverse of the no is : " +rev);
        
//        // using for loop;
//        
//            int re =0;
//        for(int i=0; n!=0;){
//            
//            i= n%10;
//            n=n/10;
//            re = re*10 + i;
//        }
//        System.out.println("reverse of number is : " + re);
//        
//        // using do while loop;
//            int rn = 0;
//        do{
//            int m = n%10;
//            n = n/10;
//            rn =rn * 10 + m;
//        }while(n!=0);
//        
//        System.out.println("Reverse of no is : "+rn);
//        
        
    }
    
}
