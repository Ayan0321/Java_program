/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
//import java.util.Scanner;
 
public class ArrayInJava {
    
     public static void inc(int a[]){
          
         a[0]=8;
         a[4]=19;
         
     }

     
    public static void main(String[] args) {
        
       // Scanner s = new Scanner(System.in);
        int nums [] = {1,3,4,5,6};
        
        //System.out.println(nums[4]);
          
        
//        System.out.println("Enter element in array :");
        for(int i = 0; i<nums.length ;i++){
            
             System.out.print(nums[i] + " ");
        }
        
        inc(nums);
        System.out.println("");
//        
       for(int j = 0; j<nums.length ;j++){
          
           System.out.print(nums[j] + " ");
      }
         
        
       
    
    
    }
    
}
