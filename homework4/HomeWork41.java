/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework41;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class HomeWork41 {

    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   boolean g = false;
   boolean t = false;
    String s =in.nextLine() ;
    if (s.length()<5)
        
    {
        
        System.out.println("FALSE");
        return;
    
    }
    if (!s.contains("&")&&!s.contains("?")&&!s.contains("%")&&!s.contains("#")&&!s.contains("*"))    
    {
        System.out.println("FALSE");
        return;
    }
     
       for (int i = 0; i < s.length(); i++) {
            
    byte[] result = s.getBytes();
  if(result[i]>=97&&result[i]<=122)
  {
 g = true;
          }
  char [] r=s.toCharArray();
      if(r[i]=='0'||r[i]=='1'||r[i]=='2'||r[i]=='3'||r[i]=='4'||r[i]=='5'||r[i]=='6'||r[i]=='7'||r[i]=='8'||r[i]=='9')
      {
      t =true;
      
      }
          }
       if(g==false||t==false){
           System.out.println("FALSE");
           return;
       }else{
       
           System.out.println("TRUE");
       }
    }
}
