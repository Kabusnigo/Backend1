/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio10 {

    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int resp, n1, n2, n;
        System.out.print("Adivine el resultado de una multiplicación entre 0 a 10: ");
        n = read.nextInt();
        n1 = (int) (Math.random() * 10);
        n2 = (int) (Math.random() * 10);
        System.out.println("" + n1 + "\t" + n2);
        resp = n1 * n2;
        while (n!=resp) {
            System.out.println("Vuelve a intentarlo");
            n = read.nextInt();
        }
        System.out.println("Respuesta Correcta");
    }
}
