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
public class Propuesto09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular el área
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);

        // Calcular el perímetro
        double perimetro = 2 * base + 2 * altura;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}


