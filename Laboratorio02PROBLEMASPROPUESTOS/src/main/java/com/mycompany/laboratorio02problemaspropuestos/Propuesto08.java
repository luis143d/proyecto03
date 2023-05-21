/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio02problemaspropuestos;

import java.util.Scanner;

/**
 *
 * @author LUIS FERNANDO SINTICALA OLIVA
 */
public class Propuesto08 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convertir a Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");

        // Convertir a Kelvin
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + kelvin + " grados Kelvin.");
    }
}


