 package com.mycompany.pro25; 
 
 class Student{
     
     public int rollno ;
     public String name ;
     public String course ;
     public int m1 , m2 , m3 ;
     
     public int total(){
         return m1+m2+m3;
     }
     
     public int avg(){
         return (m1+m2+m3)/3;
     }
     
     public String grade(){
         
         if(avg()>=75){
              return "Grade  :   A " ;
         }
         else if (avg()>= 50 && avg()<75){
             return "Grade  :   B ";
         }
         else if (avg()>= 25 && avg()< 50 ){
              return "Grade  :   C ";
         }
         else{
             return "Fail";
         }
         
     }
 }
 public class StudentTest {

     public static void main(String[] args) {
         
         Student s = new Student();
         
         s.rollno=101;
         s.name="Aamin Shaikh";
         s.course = "B.Tech";
         s.m1=70;
         s.m2=80;
         s.m3=85;
         
         System.out.println("Total : "+s.total());
         System.out.println("Average : "+ s.avg());
         System.out.println( s.grade());
         
     }
    
}
