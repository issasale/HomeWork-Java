/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework6;

/**
 *
 * @author Eissa
 */
public class Homework6 {
// Main.java

    public static void main(String[] args) {
        
        Complex num1 = new Complex(7, -3); // 2 + 3i
        Complex num2 = new Complex(12, -222); // 1 + 4i

       
        System.out.println("real" + num1);
        System.out.println("imaginary" + num2);

        Complex sum = num1.add(num2);
        System.out.println("Sum" + sum);

        Complex difference = num1.subtract(num2);
        System.out.println("Subtraction result" + difference);

        Complex product = num1.multiply(num2);
        System.out.println("raising to a power" + product);
        
        Complex power = num1.power(7);
        System.out.println("" + power);
    }
}

