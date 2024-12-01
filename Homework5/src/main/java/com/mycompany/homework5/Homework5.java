/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework5;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class Homework5 {

    public static void main(String[] args) {
      
        
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int k = in.nextInt();
           long arr[] = fibonchi(n);
           long arry[]=magicNumbers(n, k, arr);
            if (arry[k-1] != 0){
                System.out.println(arry[k-1]);
            } else {
                System.out.println("-1");
            }
        }
         public static long[] fibonchi(int n){
             long [] arr = new long [n];
             arr[0] = 1;
             if (n > 1) {
             arr[1]=1;
             }
             for (int i = 2; i < n; i++) {
                 
                 arr[i] = arr[i-1]+arr[i-2];
             }
             return arr ;   
             }
         public static long [] magicNumbers(int n ,int k ,long arr[]) 
         {
             long  arry[]= new long[n];
              int j = 0;
             for (int i = 0; i < n; i++) {
                 long number = arr[i];
                 long sum = 0;
                 
                 while(number>0) {
                     sum = sum + number % 10;
                     number = number / 10;
                    }
                 if(sum > 0 && arr[i]%sum==0)
                 {
                      arry[j] =arr[i];
                      j++;
                 }
             }
             return arry;
         }}
   

