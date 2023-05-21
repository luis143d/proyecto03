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
public class Propuesto06 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();

        // Calcular el área
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);

        // Calcular el perímetro
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
}


