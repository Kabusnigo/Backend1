/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Primer trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package Arreglos;

import java.util.Scanner;

public class Extra04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double vec[]=new double[3];
        vec=llenar(3);
        mostrar(vec,3);
    }
    public static double [] llenar(int size) {
        Scanner read = new Scanner(System.in);
        double vec[]=new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("     Estudiante "+(i+1));
            System.out.print("Primer trabajo práctico evaluativo: ");
            double tp1=read.nextDouble();
            System.out.print("Primer trabajo práctico evaluativo: ");
            double tp2=read.nextDouble();
            System.out.print("Primer Integrador: ");
            double pi=read.nextDouble();
            System.out.print("Segundo Integrador: ");
            double si=read.nextDouble();
            vec[i]=(tp1*0.1)+(tp2*0.15)+(pi*0.25)+(si*0.5);
            System.out.println("\tNota Final: "+vec[i]);
            System.out.println("");
        }
        return vec;
    }
    public static void mostrar(double []vec, int size) {
        int aprob=0, desaprob=0;
        for (int i = 0; i < size; i++) {
            if (vec[i]>=7) {
                aprob++;
            } else {
                desaprob++;
            }
        }
        System.out.println("Cantidad de aprobados: "+aprob+ "\nCantidad de desaprobados: "+desaprob);
    }
}
