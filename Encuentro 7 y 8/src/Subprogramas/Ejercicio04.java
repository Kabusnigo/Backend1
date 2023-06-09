/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package Subprogramas;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        if (primo(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    
    public static boolean primo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero%i==0) {
                return false;
            } 
        }
        return true;
    }
}
