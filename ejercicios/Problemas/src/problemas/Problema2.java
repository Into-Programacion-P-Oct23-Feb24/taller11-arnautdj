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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese 1 para calcular el área de un Cuadrado\n"
        +"Ingrese 2 para calcular el área de un Triángulo\nIngrese 3 para "+
        "Calcular el área de un Rectángulo");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Error: Valor inválido");
        }
    }
    
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del cuadrado en metros\n");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        presentarMensaje(area);
        
    }
    
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base del triangulo en metros");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la longitud de la altura del triangulo en metros");
        double altura = entrada.nextDouble();
        double area = (base * altura) / 2;
        presentarMensaje(area);
        
    }
    
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base del rectangulo en metros");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la longitud de la altura del rectangulo en metros");
        double altura = entrada.nextDouble();
        double area = (base * altura);
        presentarMensaje(area);

    }
    
    public static void presentarMensaje(double a){
        System.out.printf("A = %.2fm^2\n", a);
    }
    
}
