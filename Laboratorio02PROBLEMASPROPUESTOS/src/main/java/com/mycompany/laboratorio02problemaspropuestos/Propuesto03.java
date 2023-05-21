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
public class Propuesto03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de milímetros: ");
        int milimetros = scanner.nextInt();

        int metros = milimetros / 1000;
        int resto = milimetros % 1000;
        int decimetros = resto / 100;
        resto = resto % 100;
        int centimetros = resto / 10;
        int milimetrosRestantes = resto % 10;

        System.out.println(milimetros + " milímetros son " + metros + " metros, " + decimetros + " decímetros, " + centimetros + " centímetros y " + milimetrosRestantes + " milímetros.");
    }
}


