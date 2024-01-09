/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = obtenerArregloCiudades();
        imprimirCiudades(ciudades);
    }

    public static String[] obtenerArregloCiudades() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos del arreglo: \n");
        int n = entrada.nextInt();
        entrada.nextLine();

        String[] ciudades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nIngrese la ciudad %d: \n", i + 1);
            ciudades[i] = entrada.nextLine();
        }

        return ciudades;
    }

    public static void imprimirCiudades(String[] ciudades) {
        System.out.println("\nCiudades con 4 o 5 caracteres:");
        int long1 = 4;
        int long2= 5;
                

        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].length() == long1 || ciudades[i].length() == long2) {
                System.out.println(ciudades[i]);
            }
        }
    }

}
