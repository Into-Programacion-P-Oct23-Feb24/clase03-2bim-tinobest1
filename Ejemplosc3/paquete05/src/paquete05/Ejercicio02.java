/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;
        int valor;
        for (int filas = 0; filas < arreglo.length; filas++) {
            for (int col = 0; col < arreglo[filas].length; col++) {
                valor = arreglo[filas][col];
                if(filas==col){
                    suma = suma + valor;
                }
                        
            }
        }
        System.out.printf("Suma de valores: %d\n", suma);

    }

}
