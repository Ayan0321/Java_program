/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
public class IfelseWeek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No 1 to 7 :");
        int n = s.nextInt();
        
        if(n==1){
            System.out.println("MONDAY");
        }
        else if(n==2){
            System.out.println("TUESDAY");
        }
        else if(n==3){
            System.out.println("WEDNESDAY");
        }
        else if(n==4){
            System.out.println("THURSDAY");
        }
        else if(n==5){
            System.out.println("FRIDAY");
        }
        else if(n==6){
            System.out.println("SATURDAY");
        }
        else if(n==7){
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("ENTER VALID INPUT");
        }
        
      
        
    }
    
}
