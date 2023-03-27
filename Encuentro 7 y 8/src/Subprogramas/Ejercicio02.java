/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”
 */
package Subprogramas;

import java.util.Scanner;

// .useDelimiter("\n");  No mantiene en el buffer lo tipeado anteriormente, no hace falta el nextLine(); sino con el next();
public class Ejercicio02 {

    public static void main(String[] args) {
        String name= "";
        int edad=0;
        mostrar(edad,name);
    }
    public static void mostrar (int edad,String name){
        Scanner read = new Scanner (System.in).useDelimiter("\n");
        String opc="";
        do {
            System.out.print("Ingrese nombre: ");
            name=read.next();
            System.out.print("Ingrese la edad: ");
            edad=read.nextInt();
            System.out.print("Nombre: "+name+"\tEdad: "+edad);
            if (edad>=18) {
                System.out.println("\t Es mayor de edad.");
            } else{
                System.out.println("\t Es menor de edad.");
            }
            System.out.println("¿Desea seguir mostrando personas? S/N");
            opc=read.next();
        } while (!("n".equalsIgnoreCase(opc)));
        System.out.println("Finalizó el programa");
    }
}

/*
public static void main(String[] args) {
        // TODO code application logic here
        int edad = 0;
        String nombre = "";
        
        Suma(edad, nombre);
        
    }

    public static int Suma(int edad, String nombre) { //funcion porque devuelve un valor (mentira) si es VOID x INT no hace falta poner Return;
        boolean opcion = true;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese Su nombre y edad");
            nombre = leer.next();
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " tu edad es: " + edad + " Eres mayor de edad");
            } else {
                System.out.println(nombre + " tu edad es: " + edad + " Eres Menor de edad");

            }
            System.out.println("Desea continuar? Escriba SI");
            String confirmacion = leer.next();
            if ("NO".equals(confirmacion)) {
                opcion = true;
                System.out.println("Fin de consulta");
            } else {

                opcion = false;

            }

        } while (!opcion);

     return 0;
        
    }

}
*/
