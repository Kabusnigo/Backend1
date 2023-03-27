/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
funcion Lenght() en Java.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String chain;
        System.out.println("Ingrese una palabra o frase máx. de 8 letras");
        chain=read.nextLine();
        if (chain.length()==8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
