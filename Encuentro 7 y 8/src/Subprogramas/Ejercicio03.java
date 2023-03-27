/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i.   * 0.86 libras es un 1 €
ii.  * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package Subprogramas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese monto:");
        double n = read.nextDouble();
        System.out.println("Ingrese moneda a convertir: dolar, yen o libra");
        String conversion = read.next();
        convertir(n, conversion);
    }

    public static void convertir(double n, String conversion) {
        switch (conversion) {
            case "dolar":
                System.out.println("La conversión a dolar es: " + n * 1.08);
                break;
            case "yen":
                System.out.println("La conversión a yen es: " + n * 141.57);
                break;
            case "libra":
                System.out.println("La conversión a libra es: " + n * 160 * 51);
                break;
            default:
                System.out.println("Moneda no reconocida. Por favor, introduce dolares, yenes o libras.");
                break;
        }
    }
}
    /*

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double cantidad = sc.nextDouble();
        
        System.out.print("Introduce la moneda a la que quieres convertir (dolares, yenes o libras): ");
        String moneda = sc.next();
        
        convertirEuros(cantidad, moneda);
    }

public static void convertirEuros(double cantidad, String moneda) {
        double cambio = 0.0;
        switch(moneda) {
            case "dolares":
                cambio = cantidad * 1.28611;
                System.out.println(cantidad + " euros equivale a " + cambio + " dolares.");
                break;
            case "yenes":
                cambio = cantidad * 129.852;
                System.out.println(cantidad + " euros equivale a " + cambio + " yenes.");
                break;
            case "libras":
                cambio = cantidad * 0.86;
                System.out.println(cantidad + " euros equivale a " + cambio + " libras.");
                break;
            default:
                System.out.println("Moneda no reconocida. Por favor, introduce dolares, yenes o libras.");
                break;
        }
}
}
     */
