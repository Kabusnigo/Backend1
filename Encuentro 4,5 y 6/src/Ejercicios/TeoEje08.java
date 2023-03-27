/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
*/
package Ejercicios;

import java.util.Scanner;

public class TeoEje08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, acum=0, cont=1;
        do {
            System.out.print("Ingrese número: ");
            n=read.nextInt();
            if (n==0) {
                break;
            }
            else if (true) {
                if (n>0) {
                    acum=acum+n;
                }
            }
            cont++;
        } while (cont<=4);
        System.out.println("La suma de los números es: "+acum);
    }
}
