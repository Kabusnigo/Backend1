/*
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
 */
package Arreglos;

import java.util.Scanner;

public class Extra07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Calcular la sucesión de Fibonacci de los primeros N términos: ");
        int n=read.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" "+fibo(i));
        }
        System.out.println("");
    }
    public static int fibo(int n) {
        if (n>1) {
            return fibo(n-1)+fibo(n-2);
        } else{
            return n;
        }
        
    }
}
