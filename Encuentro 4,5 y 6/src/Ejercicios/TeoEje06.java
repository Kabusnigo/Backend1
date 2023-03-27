/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class TeoEje06 {
       public static void main(String[] args) {
       Scanner lee = new Scanner(System.in);
       int tipoMotor; 
       System.out.println("ingrese un numero del 1 al 4");
       tipoMotor=lee.nextInt();
       switch(tipoMotor){
               case 1: System.out.println("la bomba es de agua");
               break;
               case 2: System.out.println("la bomba es de gasolina");
               break;
               case 3: System.out.println("la bomba es de hormigon");
               break;
               case 4: System.out.println("la bomba es de pasta alimenticia");
               break;             
               default:                   
               System.out.println("no es una opcion");
               break;
           } 
         } 
    }
       
   