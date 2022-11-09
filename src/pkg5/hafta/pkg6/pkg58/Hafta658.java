
package pkg5.hafta.pkg6.pkg58;

import java.util.Scanner;

public class Hafta658 {

    public static void main(String[] args) {
           Scanner input = new Scanner (System.in); 
         
        System.out.println("Enter here a  number= ");
        int s = input.nextInt();
        
       
        
        for(int a=0; a<=s/3; a++){
           
           
   
            for(int b=0; b<=s/5; b++){
                 
             
                
              if(3*a + 5*b ==s){
               System.out.println(+a+b);
             
               }
        
        }
            }
    }
    
}
