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
public class Propuesto02 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        int inicio, fin;
        if (a <= b) {
            inicio = a;
            fin = b;
        } else {
            inicio = b;
            fin = a;
        }

        int cantidadNumeros = fin - inicio + 1;

        System.out.println("Entre " + a + " y " + b + " hay " + cantidadNumeros + " números enteros incluidos.");
    }
}


