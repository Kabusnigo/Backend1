/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Arreglos;

import java.util.Scanner;

public class Extra01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int acum = 0;
        System.out.print("Ingrese el tamaño del vector: ");
        int size = read.nextInt();
        int vec[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese numero: ");
            vec[i]=read.nextInt();
            acum = acum + vec[i];
        }
        System.out.println("La suma de los numeros contenidos en el vector es: "+acum);
    }
}
