/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese fila: ");
        int f = read.nextInt();
        System.out.print("Ingrese columna: ");
        int c = read.nextInt();
        int A[][] = new int[f][c];
        int B[][] = new int[f][c];
        A = llenar(A, f, c);
        B = transp(A, B, f, c);
        System.out.println("Matria A:");
        show(A, f, c);
        System.out.println("Matriz -A^t");
        show(B, f, c);
        anti(A, B, f, c);
    }

    public static int[][] llenar(int[][] matriz, int f, int c) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la matriz: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println("");
        return matriz;
    }

    public static int[][] transp(int[][] A, int[][] B,int f,int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                B[i][j] = A[j][i]*(-1);
            }
        }
        return B;
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

    public static void anti(int[][] A, int[][] B,int f,int c) {
        boolean flag=true;
        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c ; j++) {
                if (A[i][j] != B[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag==true) {
            System.out.println("B es una matriz antisimetrica de A");
        } else {
            System.out.println("B no es una matriz antisimetrica de A");
        }
    }
}
