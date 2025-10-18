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
public class TaxCal {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        
        System.out.println("Enter Cart Total :");
        float ca = a.nextFloat();
        System.out.println("Tax : "+ (0.12 * ca));
        System.out.println("Total Amount :"+ (( 0.12 * ca )+ ca));
    }
}
