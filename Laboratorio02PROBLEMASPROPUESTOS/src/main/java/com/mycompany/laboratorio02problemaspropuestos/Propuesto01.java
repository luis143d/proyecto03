/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio02problemaspropuestos;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class Propuesto01 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        
        int suma = a + b;
        int resta = a - b;
        
        System.out.println("La suma de " + a + " y " + b + " es " + suma + ".");
        System.out.println("La resta de " + a + " y " + b + " es " + resta + ".");
    }
}


