/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] arreglo1 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        System.out.printf("La suma del del arreglo es: %d", obtenerSuma(arreglo1));
    }

    public static int obtenerSuma(int[][] arreglo1) {
        int suma = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                suma += arreglo1[i][j];
            }
        }
        return suma;
    }
}
