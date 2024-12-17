/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework6;

/**
 *
 * @author Eissa
 */
// Complex.java
public class Complex {
    private double real;   
    private double imaginary;

  
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }
    public Complex power(int n) {
        Complex result = new Complex(1, 0); 
        Complex base = this;

        for (int i = 0; i < n; i++) {
            result = result.multiply(base);
        }
        return result;
    }
    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }
}

