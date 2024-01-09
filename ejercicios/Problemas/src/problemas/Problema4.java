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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese se cedula");
        String cedula = entrada.nextLine();
        System.out.println("\nDigite 1 para  calcular el valor de la planilla de"
                + " luz\nDigite 2 para calcular el valor del predio de un bien"
                + " inmueble");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            calcularValorLuz(nombre,cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre,cedula);
            } else {
                System.out.println("Error");
            }
        }
    }
    
    public static void calcularValorLuz (String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese el valor del kilowatio");
        double valorKW = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios consumidos en el mes");
        double numKW = entrada.nextDouble();
        double total = valorKW * numKW;
        System.out.printf("\nCliente %s con cedula %s debe cancelar el valor "
                + "de $%.2f\n",
                nombre, cedula, total);
    }
    
    public static void calcularPredio (String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIngrese el valor del inmueble");
        double inmueble = entrada.nextDouble();
        double predio = inmueble * 0.02;
        System.out.printf("\nCliente %s con cedula %s tiene un bien inmueble " +
                "valorado en $%.2f y tiene que pagar de predio $.2f\n",
                nombre, cedula, inmueble, predio);
    }
    
}
