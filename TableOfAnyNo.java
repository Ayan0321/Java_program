/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
public class TableOfAnyNo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter A number :");
        int n = s.nextInt();
        
        // printing table using while loop;
            int i = 1;
        while(i<=10){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
    }
    
}
