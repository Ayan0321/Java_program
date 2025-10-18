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
public class TimeConverter {
    
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println(" Enter  total event duration in Sec :");
        int s = a.nextInt();
        
        int h = s/3600;
        s%=3600;
        int m = s/60;
        s%=60;
        
            System.out.println(" Hours : " + h + ", Minutes :" + m + ", Seconds :" + s);
        
    }
    
}
