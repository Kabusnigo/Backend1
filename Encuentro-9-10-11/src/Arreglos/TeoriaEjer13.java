/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

public class TeoriaEjer13 {
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
    System.out.println ("Ingrese el numero de integrantes del equipo");
    int n = leer.nextInt();
    String[] Equipo = new String[n];
    Equipo  = cargarDatos(n);
    System.out.println ("Los integrantes del equipo son:");
    for (int i = 0;i< n ;i ++) {
        System.out.println(Equipo[i]);
    }
    }
    public static String[] cargarDatos(int n) {
        String[] equipo = new String[n];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de un integrante del Equipo");
            equipo[i] = leer.nextLine();   
        }       
        return equipo; 
    } 
}

/*
    Scanner leer = new Scanner(System.in);
    System.out.println ("Ingrese el numero de integrantes del equipo");
    int n = leer.nextInt();
    String[] Equipo = new String[n];
    Equipo  = cargarDatos(n);
    System.out.println ("Los integrantes del equipo son:");
    for (int i = 0;i< n ;i ++) {
        System.out.println(Equipo[i]);
    }
    public static String[] cargarDatos(int n) {
        String[] equipo = new String[n];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de un integrante del Equipo");
            equipo[i] = leer.nextLine();   
        }       
        return equipo; 
    } 
*/