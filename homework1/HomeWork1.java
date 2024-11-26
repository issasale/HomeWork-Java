/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework1;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class HomeWork1 {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        
           System.out.println("Welcome to my program ))) ...");
        
        System.out.println("Enter a :");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c :");
        int c = scanner.nextInt();
        if(a==0&& b>0||b<0 &&c==0)
        {               
            System.out.println("roots = "+0);
                        System.exit(0);
        }
        if(a==0 && b==0 && c==0)
        {
                System.out.println("x∈R");
                System.exit(0);
        }else if (a==0 && b==0 && c==1)
        {
            
            System.out.println("No roots");
          System.exit(0);
        }
   int  delta = ( b * b )- (4 * a * c)   ;
      
         
        if((a < 1000000 || a > -1000000 || b < 1000000 || b > -1000000 || c < 1000000 || c > -1000000 ))
        {
                            if( delta>0)        
                            { double root1 = ((-1 * b) + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
                              double root2 =  ((-1 * b) - Math.sqrt((Math.pow(b,2)) - (4 * a * c))) / (2 * a);
                              if(root1<root2){
                              System.out.println("Root1 is: " + (double)Math.round(root1 * 1000d) / 1000d);
                              System.out.println("Root2 is: " + (double)Math.round(root2 * 1000d) / 1000d);
                              System.exit(0);}else
                              {
                              System.out.println("Root2 is: " + (double)Math.round(root2 * 1000d) / 1000d);
                              System.out.println("Root1 is: " + (double)Math.round(root1 * 1000d) / 1000d);
                              }
                                                }
        
        if( delta<0)
                 {
              System.out.println("no Roots");
              
                    System.exit(0);

                     }
                           else if( delta==0)
                                            {
                    
                                            double root3 =   (-1*b)/(2*a)   ;

                                            System.out.println("Root3 is: " + (double)Math.round(root3 * 1000d) / 1000d);

                                            System.exit(0);
                                            }
            
        }}
                }
                                
        
                
    

