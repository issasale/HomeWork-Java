/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework2;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class HomeWork2 {

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in); 
            int n = in.nextInt();
            int t = (int) Math.pow(5, n);
        if(n==1)
        {
            t=5;
            System.out.println(t);
        }       
        if(n>1)
        {
            t=25;
        System.out.println(t);
        } 
        if(n==0)
        {
                t=1;
                   System.out.println(t);
        }           
        }}
    

