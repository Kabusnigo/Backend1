/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.print("ingrese un numero para formar un cuadrado de asteriscos: ");
        num = read.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num || i == 1 || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
}