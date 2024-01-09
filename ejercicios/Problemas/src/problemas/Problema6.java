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
public class Problema6 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        System.out.printf("La media aritmética es: %.4f\n", 
                calcularMedia(arreglo));

        System.out.printf("La desviación estándar es: %.4f\n", 
                calcularDesviacion(arreglo, calcularMedia(arreglo)));
    }

    public static double calcularMedia(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return (double) suma / arreglo.length;
    }

    public static double calcularDesviacion(int[] arreglo, double media) {
        double sumaCuadradosDiferencias = 0;
        for (int i = 0; i < arreglo.length; i++) {
            double diferencia = arreglo[i] - media;
            sumaCuadradosDiferencias += Math.pow(diferencia, 2);
        }
        double varianza = sumaCuadradosDiferencias / arreglo.length;
        return Math.sqrt(varianza);
    }
}
