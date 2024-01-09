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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la nota 1");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        double nota4 = entrada.nextDouble();
        System.out.printf("El promedio de las notas %.2f, %.2f, %.2f, %.2f es %s\n",
                nota1, nota2, nota3, nota4,
                obtenerPromedio(nota1, nota2, nota3, nota4));
    }

    public static String obtenerPromedio(double nota1, double nota2, 
            double nota3, double nota4) {
        double promedioCuant = (nota1 + nota2 + nota3 + nota4) / 4;
        String promedioCual="";
        if (promedioCuant <=5) {
            promedioCual = "Regular";
        } else {
            if (promedioCuant >5 && promedioCuant <=8) {
                promedioCual = "Bueno";
            } else {
                if (promedioCuant > 8 && promedioCuant <=9) {
                    promedioCual = "Muy Bueno";
                } else {
                    if (promedioCuant >9 && promedioCuant <=10) {
                        promedioCual = "Sobresaliente";
                    }
                }
            }
        }
        return promedioCual;
    }
}
