/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homwork2;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class Homwork2 {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int n = in.nextInt();
        int r =1 ;
        int t= 1;
        n=n+1;
        int[] s = new int[n];
        
    for (int i = 1; i <n ; i++)
        {            
             s[i] = in.nextInt();                  
           if(s[i]==s[i-1])
         {
              r++;
         }else
         {         
         t= Math.max(r,t );
         r=1;         
         }      
         }
            System.out.println("r = "+Math.max(r, t));       
   
}
}
        