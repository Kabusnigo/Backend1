/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
*/
package Arreglos;

import java.util.Scanner;

public class Extra03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese tamaño del vector: ");
        int size=read.nextInt();
        int vec[]=new int[size];
        vec=llenar(size);
        mostrar(vec, size);
    }
    public static int [] llenar(int size) {
        Scanner read = new Scanner(System.in);
        int vec[]=new int[size];
        for (int i = 0; i < size; i++) {
            vec[i]=(int)(Math.random()*11);
        }
        System.out.println("");
        return vec;
    }
    public static void mostrar(int [] vec, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("("+vec[i]+")");
        }
        System.out.println("");
    }
}
