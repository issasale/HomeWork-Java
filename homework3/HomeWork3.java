/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork3;


/**
 *
 * @author Eissa
 */
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       
        int n = in.nextInt();
        int[][] s = new int[n][n];
        
     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = in.nextInt();
            }
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (s[i][j] == s[i][k]) {
                        System.out.println("NO");
                        return;  
                    }
                }
            }
        }

        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (s[i][j] == s[k][j]) {
                        System.out.println("NO");
                        return;  
                    }
                }
            }
        }

        
        System.out.println("YES");
    }
}

       
        
        
                
                
                   
        

















     
                


