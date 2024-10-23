//Programa que pide dos números y un operador y muestra el resultado de la operación                        
package ud2.ejemplos;

import java.util.*;
import java.io.*;

public class Ejemplo3Switch {
    public static void main(String[] args) throws IOException{
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");                                              
        operador = (char)System.in.read(); 
        //operador = sc.NextLine().ChartAt(0):
        //no porque carga el enter en el bufer 
        sc.close();
        switch (operador) {
                case '-' : Resultado = A - B;
                           break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B; 
                           break;
                case '/' : if(B!=0){
                              Resultado = A / B; 
                           }else{
                              System.out.println("\nNo se puede dividir por cero");                         
                              calculado = false;
                              //bandera - comprobación de que la suposición funciona
                           }
                           break;
                default : System.out.println("\nOperador no valido");
                          calculado = false;               
        }
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);                                          
        }
    }
}
