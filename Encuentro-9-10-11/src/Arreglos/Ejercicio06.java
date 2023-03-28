/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int d = read.nextInt();
        int A[][] = new int[d][d];
        A = llenar(A, d, d);
        show(A, d, d);
        magica(A, d, d);
    }

    public static int[][] llenar(int[][] matriz, int f, int c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la matriz");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                do {
                    System.out.print("Nro. entre 1 y 9:  ");
                    matriz[i][j] = read.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
        System.out.println("");
        return matriz;
    }

    public static void show(int[][] matriz, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void magica(int[][] A, int f, int c) {
        int fila = 0, columna = 0, diag = 0, secun = 0, cont=0;
        boolean flag = true, flag2 = true;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                fila = fila + A[i][j];
                columna = columna + A[j][i];
                if (flag2) {
                    while (cont<c) {
                        diag = diag + A[cont][cont];
                        secun = secun + A[cont][(c-1) - cont];
                        cont++;
                    }
                    flag2=false;
                }
            }
            if (fila != diag || columna != diag || diag != secun) {
                flag = false;
                break;
            }
            fila=0;
            columna=0;
        }
        if (flag) {
            System.out.println("Es una matriz mágica");
        } else{
            System.out.println("No es una matriz mágica");
        }
    }
}
