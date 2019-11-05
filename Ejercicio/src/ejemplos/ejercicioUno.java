/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Acer
 * un padre de familia a pagado 3 cuaotas de navidad de sus hijos la cuota 
 * uno fue de 15 dolares y la cuota dos de 10 y la cuota tres de 16 dolares
 * generar un programa en lenguaje java que permitir ingresar por teclado 
 * el valor de las cuotas, luego presentar el promedio de dolares pagados entre 
 * las cuotas ademas presentar un mensaje en pantalla (Verdadero o Falso)
 * del promedio si el promedio es mayor o igual a 11 deberia salir verdadero si
 * el promedio es menor a 11 deberia salir falso
 */
public class ejercicioUno {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);   
    
    int cuota1;
    int cuota2;
    int cuota3;
    int promedio;
    
    System.out.println("Ingrese el valor de la Cuota Uno");
    cuota1 = entrada.nextInt();
    System.out.println("Ingrese el valor de la Cuota Dos");
    cuota2 = entrada.nextInt();
    System.out.println("Ingrese el valor de la Cuota Tres");
    cuota3 = entrada.nextInt();
    
    promedio = (cuota1 + cuota2 + cuota3)/3;
    System.out.printf("Promedio de las cuotas: %d\n" + "Promedio es: %s\n",
            promedio, promedio>=11);
        }        
}
