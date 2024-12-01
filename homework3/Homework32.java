/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework32;

import java.util.Scanner;

/**
 *
 * @author Eissa
 */
public class Homework32 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
int M = in.nextInt();
int N = in.nextInt();
in.nextLine();
boolean r=false;
char [][] s = new char [M][N];
     for (int i = 0; i <  M; i++) {
           s[i]=in.nextLine().toCharArray();    
     }
     if(s[0][0]=='#' || s[M-1][N-1]=='#'){
         System.out.println("NO");
         return;
     }
     boolean vis[][]=new boolean[M][N];
     vis[0][0]=true;
     
    for (int i = 0; i <  s.length; i++) {
        for (int j = 0; j < N; j++) {
        if(s[i][j]=='#'){
           vis[i][j]=false;
        }else{
        vis[i][j]=true;
        }
        }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(vis[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < s.length; i++) {
            for (int j =2; j < N; j++) {
                if(vis[i][j]==false&&vis[j][i]==false && vis[j-1][j-1]==false){
                    
                    
                       System.out.println("NO");
                       return;
                }else{
                     r=true;
                }
            }
        }
        if(r=true){
            System.out.println("Yes");
        }
    }
}
