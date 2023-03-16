/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */
package pkg02;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase=read.nextLine();
        System.out.println("Su frase en mayus: "+frase.toUpperCase());
        System.out.println("Su frase en minus: "+frase.toLowerCase());
    }
}
