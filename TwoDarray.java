/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
//import java.util.Scanner;
 
public class TwoDarray {

     
    public static void main(String[] args) {
        
   //Scanner s = new Scanner (System.in);
        
        int ar [][] = new int [3][4];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               ar[i][j] = (int)( Math.random() * 100);
            }
            //System.out.println("");
        }
        
        for(int a=0;a<3;a++){
            for(int b=0;b<4;b++){
                System.out.print(ar[a][b] + " ");
            }
             System.out.println(" ");
        }
        
        for (int t[]: ar){
            
         
            for(int e : t){
                System.out.print(e + " ");
            }
            System.out.println(" ");
        }
    }
    
}
