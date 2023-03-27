/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int min, dia=0, hs=0;
        System.out.print("Ingrese tiempo en minutos: ");
        min=read.nextInt();
        hs=min/60;
        dia = hs / 24;
        hs = hs % 24;
        System.out.println("El equivalente es: "+dia+" dia, "+hs+" horas.");
    }
}
