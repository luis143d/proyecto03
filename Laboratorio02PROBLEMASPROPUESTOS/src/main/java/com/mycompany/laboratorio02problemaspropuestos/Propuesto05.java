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
public class Propuesto05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int numero4 = scanner.nextInt();

        int suma = numero1 + numero2 + numero3 + numero4;

        double porcentaje1 = (double) numero1 / suma * 100;
        double porcentaje2 = (double) numero2 / suma * 100;
        double porcentaje3 = (double) numero3 / suma * 100;
        double porcentaje4 = (double) numero4 / suma * 100;

        System.out.println("El porcentaje del primer número es: " + porcentaje1 + "%");
        System.out.println("El porcentaje del segundo número es: " + porcentaje2 + "%");
        System.out.println("El porcentaje del tercer número es: " + porcentaje3 + "%");
        System.out.println("El porcentaje del cuarto número es: " + porcentaje4 + "%");
    }
}

