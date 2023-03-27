/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o resultados.
 */
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio11 {
    public static void main(String[] args) {
        /*
        Scanner leer = new Scanner(System.in);
        int num1;
        int contador = 0;
        System.out.println("Ingrese un Numer entero;");
        num1 = leer.nextInt();
        do {
           num1=Math.round(num1/10); 
           contador ++ ;
           
        } while ( num1 != 0);
        
        
        System.out.println("El numero tiene: " + contador + " digitos");
    }
    
}
        */
        Scanner read = new Scanner(System.in);
        int n, cifra=1;
        System.out.println("Ingrese nro. entero:");
        n=read.nextInt();
        while (n>=10) {
            n=n/10;
            cifra++;
        }
        System.out.println("La cantidad de cifras que tiene son: "+cifra);
        
    }
}


