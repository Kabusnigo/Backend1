/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int familia, hijos, edad, acum=0, cont=0;
        
        do {
            System.out.print("Ingrese la cantidad de familias:  ");
            familia = read.nextInt();
        } while (familia < 1);
        
        for (int i = 0; i < familia; i++) {
            System.out.print("Ingrese la cantidad de hijos:  ");
            hijos = read.nextInt();
            if (hijos > 0) {
                for (int j = 1; j <= hijos; j++) {
                    do {
                        System.out.print("Ingrese la edad del " + j + " hij@: ");
                        edad = read.nextInt();
                    } while (edad < 1);
                    acum=acum+edad;
                    cont++;
                }
            }
        }
        System.out.println("La media de edad de los hijos de las familias es:  "+acum/cont);
    }
}
