/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package Arreglos;

import java.util.Scanner;

public class Extra02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el temaño de ambos vectores: ");
        int size = read.nextInt();
        int v1[] = new int[size];
        int v2[] = new int[size];
        System.out.println("Cargue el primer vector");
        v1 = llenar(size);
        System.out.println("Cargue el segundo vector");
        v2 = llenar(size);
        show(v1, size);
        show(v2, size);
        compar(v1, v2, size);
    }

    public static int[] llenar(int size) {
        Scanner read = new Scanner(System.in);
        int vec[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese " + (i+1) + " nro: ");
            vec[i] = read.nextInt();
        }
        System.out.println("");
        return vec;
    }

    public static void show(int[] vec, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("(" + vec[i] + ")");
        }
        System.out.println("");
    }

    public static void compar(int[] v1, int[] v2, int size) {
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (v1[i] != v2[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
