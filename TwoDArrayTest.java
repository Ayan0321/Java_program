
 package com.mycompany.pro25;

public class TwoDArrayTest {

    static  public  void   main(String[] args) 
     
     {
         
         int A[][] = new int [5][4];
         int B[][] = {{1,3,5},{2,4,6},{11,12,13}};
         
         for (int i=0; i<3;i++){
             
             for(int j=0; j<3;j++){
                 System.out.print(B[i][j] + " ");
                 
             }
             System.out.println("");
         }
         
         for(int x[] : B){
             for(int y : x){
                 System.out.print(y +"  ");
                 
             }
             System.out.println("");
             
         }
          
     }
    
}
