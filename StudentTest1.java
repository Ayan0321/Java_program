package com.mycompany.pro25;
import java.util.*;
 class Student1{
     
     private int no;
     private String name;

    public int getNo() {
        return no;
    }
    
    public String getName() {
        return name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }
     
     
 }
public class StudentTest1 {

     
    public static void main(String[] args) {
        Student1 s = new Student1();
        
        s.setName("Ayan Khan");
        s.setNo(35);
        
        System.out.println("Name  : " + s.getName());
        System.out.println("Roll no  : "+ s.getNo());
         
    }
    
}
