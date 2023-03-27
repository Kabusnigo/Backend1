/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package Ejercicios;

import java.util.Scanner;

public class TeoEje09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese valor: ");
            n=read.nextInt();
            if (n>=0 && n<=20) {
                System.out.print(""+n+" ");
                for (int k = 1; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
