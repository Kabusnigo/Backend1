/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package Subprogramas;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice, n1, n2, res;
        System.out.print("Ingrese dos números: ");
        n1=read.nextInt();
        n2=read.nextInt();
        do {
            System.out.println("Elija una opción:\n1-Sumar\t2-Restar\t3-Multiplicar\t4-Dividr\t0-Salir");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("La suma es:  "+suma(n1, n2));
                    break;
                case 2:
                    System.out.println("La resta es:  "+resta(n1, n2));
                    break;
                case 3:
                    System.out.println("La multiplicación es:  "+multi(n1, n2));
                    break;
                case 4:
                    System.out.println("La división es:  "+div(n1, n2));
                    break;
                default:
                    System.out.println("Finalizó el programa");;
            }
        } while (choice != 0);
    }
    private static int suma(int a, int b){
        int res=a+b;
        return res;
    }
    private static int resta(int a, int b){
        int res=a-b;
        return res;
    }
    private static int multi(int a, int b){
        int res=a*b;
        return res;
    }
    private static double div(int a, int b){
        double res=a/b;
        return res;
    }
}