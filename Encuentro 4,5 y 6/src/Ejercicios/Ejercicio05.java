/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, lim, acum=0;
        System.out.print("Ingrese límite: ");
        lim=read.nextInt();
        if (lim>0) {
            while (acum<=lim) {
                System.out.println("Ingrese valor: ");
                n=read.nextInt();
                acum=acum+n;
            }
        }
        System.out.println("Se superó el limte: "+lim+"\nEl acumulador fue de: "+acum);
    }
}
