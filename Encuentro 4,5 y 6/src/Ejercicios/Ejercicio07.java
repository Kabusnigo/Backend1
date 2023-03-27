/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int acum_right=0, acum_wrong=0;
        System.out.println("Ingrese una sec. de caracteres menores a 5: ");
        String clave = read.nextLine();
        while (!("&&&&&".equals(clave))) {
            if ("X".equals(clave.substring(0,1)) && "O".equals(clave.substring(4,5)) && clave.length()==5) {
                acum_right++;
            } else {
                acum_wrong++;
            }
            System.out.println("Ingrese una sec. de caracteres menores a 5:");
            clave = read.nextLine();
        }
        System.out.println("La cantidad de correctas es: "+acum_right+"\nLa cantidad de incorrectas es: "+acum_wrong);
    }
}