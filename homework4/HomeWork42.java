/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework42;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class HomeWork42 {

    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   String s = in.nextLine();
  
         for (int i = 0; i < s.length(); i++) {
         char f = s.charAt(i);
         if(s.indexOf('@')==-1||s.indexOf('@')==0)
         {
             System.out.println("INCORRECT");
             return;         
         }
        if( s.codePointAt(i)>=65&& s.codePointAt(i)<=90)
        {
         System.out.println("INCORRECT");
         return;
        }
       if(s.endsWith("mail.ru")==false)
       {
       System.out.println("INCORRECT");
         return;
       }
        if(s.startsWith("."))
       {
       System.out.println("INCORRECT");
         return;
     }              
      }
        System.out.println("CORRECT");
    }
}
