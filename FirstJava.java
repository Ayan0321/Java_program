
package com.mycompany.pro25;
import java.util.Scanner;
/* This is 
my first program*/
public class FirstJava {
    
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your no :");
      
        int m = a.nextInt();
        if(m>90){
            System.out.println("A GRADE ");
        }
        else if ( m<=90 && m>=80){
            System.out.println("B GRADE ");         }
         else{
            System.out.println("FAIL");
        }
    }
}

