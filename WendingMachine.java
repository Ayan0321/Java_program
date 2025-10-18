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
public class WendingMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int n = s.nextInt();
        int f =  n%10;
        int t = n/10;
        f = f/5;
        System.out.println("Amount : 10 * "+ t +", 5 * "+f);
    }
}
