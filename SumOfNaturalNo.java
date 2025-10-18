/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

    // sum of n natural number

package com.mycompany.pro25;
import java.util.Scanner;

public class SumOfNaturalNo {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter  a  number : ");
            int n = s.nextInt();
            int sum = 0;
        // For loop 
         for(int i=1;i<=n;i++){
             
             sum+=i;
         }
        System.out.println("Sum is : "+ sum);
         
        // While loop 
         /*   int j = 1;
            int  add = 0;
         while(j<=n){
             add+=j;
             j++;
         }
        
        System.out.println("Sum is : " + add);
        
        // Do-While loop 
            int k =0;
            int add1 = 0;
        do{
            add1 += k;
            k++;
        }while(k<=n);
        
        System.out.println("Sum is : "+ add1);*/
    }
    
}
