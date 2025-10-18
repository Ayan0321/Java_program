/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro25;
import java.util.Scanner;
/**
 *
 * @author ayank
 */
public class SplitBills {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Total amount :");
        float  amt = s.nextFloat();
        System.out.println("Number of friend : ");
        int n = s.nextInt();
        amt = amt/n;
        System.out.println("Each Should Pay :"+ amt);
    }
    
}
