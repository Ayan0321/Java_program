 
package com.mycompany.pro25;

abstract class Cooking
{
    
    public abstract void cook();
   
    void chop()
    {
        System.out.println("Chopping");
    }
    
}
public class Second2 extends Cooking
{
        @Override
        public void cook()
        {
            System.out.println("Cooking");
        }

    public static void main(String[] args) 
    {
       
        Second2 s = new Second2();
        // Cooking c = new Second2();
    
        s.cook();
        s.chop();
    }
}
