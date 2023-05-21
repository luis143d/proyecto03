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
public class Propuesto04 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        double denominador = Math.pow(a, 2) - Math.pow(b, 2);
        double numeradorC = 4 * Math.pow(a, 4) + 3 * b * a + Math.pow(b, 2);
        double cResultado = numeradorC / denominador;
        double dResultado = (3 * Math.pow(c, 2) + a + b) / 4;

        System.out.println("El valor de C es: " + cResultado);
        System.out.println("El valor de D es: " + dResultado);
    }
}


