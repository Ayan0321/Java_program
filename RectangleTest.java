 package com.mycompany.pro25; 
 class Rectangle {
 public double length;
 public double breadth;
 
 public double area(){
     
     return length * breadth;
 }
 
 public double perimeter (){
     return 2 * (length + breadth);
 }
 
 public boolean isSquare(){
     if(length == breadth ){
         return true;
     }
     return false;
 }
    
}
 public class RectangleTest {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.length = 10.5;
        r.breadth = 10.5;
        
        System.out.println("Area is = "+ r.area());
        System.out.println("Perimeter is = "+ r.perimeter());
        System.out.println("Is Square = " + r.isSquare());
        
        Rectangle r1 = new Rectangle();
        r1.length = 30.5;
        r1.breadth = 10.5;
        
        System.out.println("Area 2 is = "+ r1.area());
        System.out.println("Perimeter is = "+ r1.perimeter());
        System.out.println("Is Square = " + r1.isSquare());
     }
    
}
