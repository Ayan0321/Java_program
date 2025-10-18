/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;
/**
 *
 * @author ayank
 */
public class StatickeyWord {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Dem d = new Dem();
       
        d.name = "apple";
        d.price = 1600;
        Dem.type = "smartphone";
        
        System.out.println(" Name :"+ d.name+ "\n Price :"+ d.price+ "\n Type :"+Dem.type );
        
        
        // TODO code application logic here
    }
    
}
