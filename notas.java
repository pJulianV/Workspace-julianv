/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */

public class Notas{
    
    private static final int estudiante = 5;

    // Función X para cargas nombres 
    public static String[] getNombres(Scanner sc) {
        String[] nombres = new String[estudiante];
        System.out.println("Nombres:");
        for (int i = 0; i < estudiante; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }
        return nombres;
    }
    
    // Función Y para cargar notas en doublé
    public static double[] getNotas(Scanner sc, String[] nombres) {
        double[] notas = new double[estudiante];
        System.out.println("\nNotas (del 1 a 10) ");        
        for (int i = 0; i < estudiante; i++) {
            double nota = 0.0;
            boolean ok = false;            
            do {
                System.out.print("Nota de " + nombres[i] + ": ");
                String input = sc.nextLine();
                
                try {
                    nota = Double.parseDouble(input);
                    // Mensajes de error
                    if (nota >= 1.0 && nota <= 10.0) {
                        ok = true;
                    } else {
                        System.err.println("Lo numeros deben ser entre 1 y 10"); 
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Usa solo un número (ejem: 7.5)"); 
                }
            } while (!ok);
            notas[i] = nota;
        }
        return notas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Cargar datos
        String[] nombres = getNombres(sc);
        double[] notas = getNotas(sc, nombres);
        // promedio
        double suma = 0.0;
        for (double n : notas) {
            suma += n;
        }
        double promedio = suma / estudiante;

        // Imprimir 
        System.out.println("\nResultado");
        System.out.printf("Promedio del curso: %.2f\n", promedio); 
        
        System.out.println("\nEstudiante con bajo promedio:");
        boolean hayBajoPromedio = false;
         // Solo los que están por debajo
        for (int i = 0; i < estudiante; i++) {
            if (notas[i] < promedio) {
                System.out.printf("%s: %.2f\n",nombres[i], notas[i]);
                hayBajoPromedio = true;
            }
        }        
        if (!hayBajoPromedio) {
             System.out.println("Nadie esta debajo del promedio");
        }
        sc.close();
    }
}