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
public class Propuesto07 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas: ");
        int horas = sc.nextInt();
        // Convertir a minutos y segundos
        int minutos = horas * 60;
        int segundos = horas * 60 * 60;

        System.out.println(horas + " horas equivalen a " + minutos + " minutos y " + segundos + " segundos.");
    }
}

