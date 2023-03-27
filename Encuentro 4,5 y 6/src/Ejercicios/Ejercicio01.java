/*
. Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un número: ");
        n=read.nextInt();
        if (n%2==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    } 
}
