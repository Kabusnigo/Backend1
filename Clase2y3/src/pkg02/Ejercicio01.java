
package pkg02;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n1, n2, suma;
        System.out.println("Ingrese el primer número: ");
        n1=leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2=leer.nextInt();
        suma=n1+n2;
        System.out.println("El resultado es: " +suma);
    }
    
}
