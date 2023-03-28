/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package Arreglos;

import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        String vecName[] = new String[5], matriz[][] = new String[20][20];
        vecName = llenarVec();
        matriz = llenarmatriz(vecName);
        show(vecName);
        mostrar(matriz);
    }

    public static String[] llenarVec() {
        Scanner read = new Scanner(System.in);
        String vec[] = new String[5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese nombre de entre 3 a 5 caracteres: ");
                vec[i] = read.nextLine();
            } while (vec[i].length() < 3 || vec[i].length() > 5);
        }
        System.out.println("");
        return vec;
    }
    public static void show(String[] vec) {
        for (int i = 0; i < 5; i++) {
            System.out.print("(" + vec[i] + ")");
        }
        System.out.println("");
    }
    public static String[][] llenarmatriz(String[] vec) {
        String matriz[][] = new String[20][20];
        int f = 0, c = 0, l = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="-";
            }
        }
        for (int k = 0; k < 5; k++) {
            f = (int) (Math.random() * 20);
            c = (int) (Math.random() * 15);
            System.out.print("f: " + f);
            System.out.print("        c: " + c);
            System.out.println("");
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (i == f && j == c) {
                        while (l < vec[k].length()) {
                            matriz[i][j + l] = vec[k].substring(l, l + 1);
                            l++;
                        }
                       j = c + l;
                    }
                    if (matriz[i][j].equals("-")) {
                         matriz[i][j] = Integer.toString((int) (Math.random() * 10));
                    } 
                }
                l = 0;
            }
        }
        return matriz;
    }
    public static void mostrar(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
