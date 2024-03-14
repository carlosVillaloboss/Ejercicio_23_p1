package com.mycompany.ejercicio_23_p1;
import java.util.Scanner;

public class Ejercicio_23_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, discriminante, sqrt_, x1, x2;
        
        System.out.println("Para resolver la ecuacion de segundo grado, ingrese los valores de:");
        System.out.print("A: ");
        a = scanner.nextDouble();
        System.out.print("B: ");
        b = scanner.nextDouble();
        System.out.print("C: ");
        c = scanner.nextDouble();
        
        discriminante = b * b - 4 * a * c;
        
        if (discriminante < 0) {
            System.out.println("La ecuacion no tiene soluciones reales.");
        } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            System.out.println("La ecuacion tiene una solución real:");
            System.out.println("x = " + x1);
        } else {
            sqrt_ = Math.sqrt(discriminante);
            x1 = (-b + sqrt_) / (2 * a);
            x2 = (-b - sqrt_) / (2 * a);
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        
        scanner.close();
    }
}
