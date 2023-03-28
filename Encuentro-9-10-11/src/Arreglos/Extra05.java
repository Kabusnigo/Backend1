/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package Arreglos;

import java.util.Scanner;

public class Extra05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la fila: ");
        int f = read.nextInt();
        System.out.print("Ingrese la columna: ");
        int c = read.nextInt();
        int matriz[][] = new int[f][c];
        matriz = llenar(f, c);
        mostrar(matriz, f, c);
    }

    public static int[][] llenar(int f, int c) {
        int matriz[][] = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }
        return matriz;
    }

    public static void mostrar(int[][] matriz, int f, int c) {
        int acum=0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("("+matriz[i][j]+")");
                acum=acum+matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de sus elementos es: "+acum);
    }
}
