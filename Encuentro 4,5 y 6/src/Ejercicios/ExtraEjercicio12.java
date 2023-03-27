/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 999; i++) {
            String num = String.format("%03d", i); // Formatear el número con 3 dígitos, rellenando con ceros a la izquierda si es necesario
            String numConE = num.replace("3", "E"); // Reemplazar todos los 3 con E
            System.out.println(numConE); // Mostrar el número
        }
    }
}
