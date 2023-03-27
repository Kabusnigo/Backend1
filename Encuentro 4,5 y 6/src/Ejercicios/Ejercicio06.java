/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, menu;
        float div;
        String choice="n";
        System.out.print("Ingrese pimer número:    ");
        n1 = read.nextInt();
        System.out.print("Ingrese segundo número:  ");
        n2 = read.nextInt();
        do {
            System.out.print("Menú:\t1-Sumar\t2-Restar\t3-Multiplicar\t  4-Dividir\t5-Salir\nElija una opción: ");
            menu = read.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("1-Suma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.print("2-Resta: " + (n1 - n2));
                    break;
                case 3:
                    System.out.print("3-Multiplicación: "+n1*n2);
                    break;
                case 4:
                    div=n1/n2;
                    System.out.print("4-Dividir: "+div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    choice = read.next();
                    if (choice.equalsIgnoreCase("s")) {
                        System.out.println("Terminó la ejecución");
                    }
                    break;
                default:
                    System.out.println("No se ingresó una opción válida");
            }
            System.out.println("");
        } while ( !("s".equals(choice)));
    }
}