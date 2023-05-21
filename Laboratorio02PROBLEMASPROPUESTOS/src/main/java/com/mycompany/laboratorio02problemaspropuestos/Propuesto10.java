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
public class Propuesto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los grados sexagesimales: ");
        double gradosSex = sc.nextDouble();

        // Convertir a grados centesimales
        double gradosCen = (gradosSex / 360) * 400;
        System.out.println("Los grados centesimales son: " + gradosCen);
    }
}


