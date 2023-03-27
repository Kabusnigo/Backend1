/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package Ejercicios;

import java.util.Scanner;

public class TeoEje07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Ingrese nota: ");
        n=read.nextInt();
        while (n<0 || n>10) {
            System.out.print("Ingrese nota: ");
            n=read.nextInt();
        }
        System.out.println("Su nota es: "+n);
    }
}
