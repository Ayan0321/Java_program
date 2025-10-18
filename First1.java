 package com.mycompany.pro25;
 
 interface B 
 {
    
    public void display();
 }
 
 interface C 
 {
    public void show();
 }
 
class A implements B , C 
 {
    public void display()
    {
       
        System.out.println("Inside display method in A ");
        
    } 
    
    public void show()
    {
        System.out.println("Inside show method in A ");
        
    }
    public void print()
    {
         
        System.out.println("I belong to A ");
    }
 }
 public class First1 extends A  
 {

     
    public static void main(String[] args) 
    {
         First1 obj = new First1();
         obj.display();
         obj.show();
         obj.print();
        
    
    }
    
}
