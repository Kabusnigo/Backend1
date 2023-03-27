/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
  Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas
*/
package Ejercicios;

import java.util.Scanner;

public class ExtraEjercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cociente=0, resta, dividendo, divisor;
        System.out.println("Ingrese el dividendo y divisor mayores a 1: ");
        dividendo=read.nextInt();
        divisor=read.nextInt();
        if(dividendo>1 && divisor>1){
            do {
                resta=dividendo-divisor;
                cociente++;
                dividendo=resta;
                System.out.println(""+dividendo);
            } while (divisor<resta);
            System.out.println("El cociente es: "+cociente+"\nEl residuo es: "+dividendo);
        }
    }
}
