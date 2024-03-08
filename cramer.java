package cramer;

import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamano = 2;
        double[] coeficientes = new double[tamano * tamano];
        double[] terminosIndependientes = new double[tamano];

        System.out.println("Ingrese los coeficientes y términos independientes de las ecuaciones:");

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print("Coeficiente a" + (i + 1) + (j + 1) + ": ");
                coeficientes[i * tamano + j] = scanner.nextDouble();
            }
            System.out.print("Término independiente c" + (i + 1) + ": ");
            terminosIndependientes[i] = scanner.nextDouble();
        }

        double determinantePrincipal = coeficientes[0] * coeficientes[3] - coeficientes[1] * coeficientes[2];

        if (determinantePrincipal == 0) {
            System.out.println("El sistema es incompatible o tiene infinitas soluciones.");
        } else {
            double determinanteDx = terminosIndependientes[0] * coeficientes[3] - terminosIndependientes[1] * coeficientes[1];
            double determinanteDy = coeficientes[0] * terminosIndependientes[1] - coeficientes[2] * terminosIndependientes[0];

            double x = determinanteDx / determinantePrincipal;
            double y = determinanteDy / determinantePrincipal;

            System.out.println("Solución:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        scanner.close();
    }
}