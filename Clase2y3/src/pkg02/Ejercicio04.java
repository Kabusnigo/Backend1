/*
   Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
   La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package pkg02;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       double temp, far;
       System.out.println("Ingrese la temp. en centigrados: ");
       temp=read.nextDouble();
       far=32+(9*temp/5);
       System.out.println("En Farenheit sería: "+far);
    }
}
