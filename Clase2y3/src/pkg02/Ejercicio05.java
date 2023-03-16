/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package pkg02;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero entero: ");
        num=read.nextInt();
        System.out.println("El doble del número es: " +num*2+ "\tEl triple es: " +num*3+ "\nLa raíz es:\t" +Math.sqrt(num) );
    }
}
