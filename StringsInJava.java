/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pro25;

 
public class StringsInJava {

     
    public static void main(String[] args) {
         
        
//        String str = "Ayan khan";
//        String st = "Ayan khan";
//        System.out.println(str==st);

//     String name = new String("Ayan");
//        System.out.println( "hello "+name);
//        System.out.println(name.hashCode());
//        System.out.println(name.charAt(2));
//        System.out.println(name.concat(" khan"));
//
//        String name = "Ayan";
//        name = name + " khan";
//        System.out.println("Hello " + name);
//        
//        String st1 = "ayan";
//        String st2 = "ayan";
//        System.out.println(st1==st2);


            StringBuffer sb = new StringBuffer("ayan");
            sb.append(" khan");
            sb.insert(9, " learning java");
            System.out.println(sb.capacity());
            System.out.println(sb.length());
            System.out.println(sb);


    }
    
}
