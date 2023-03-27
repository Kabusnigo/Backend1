/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese la clave: ");
        frase=read.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
