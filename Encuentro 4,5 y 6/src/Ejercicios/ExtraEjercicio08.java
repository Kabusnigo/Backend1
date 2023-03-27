/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio08 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, i = 0, par = 0;
        do {
            System.out.print("Ingrese número entero:\t");
            n = read.nextInt();
            if (n > 0) {
                if (n%5==0) {
                    break;
                }
                i++;
                if (n % 2 == 0) {
                    par++;
                }
            }
        } while ((n*0) == 0);
        System.out.println("La cantidad de nro pares es: " + par + "\nLa cant. de nro impares es: " + (i - par));
    }
}
