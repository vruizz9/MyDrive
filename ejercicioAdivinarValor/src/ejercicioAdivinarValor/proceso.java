package ejercicioAdivinarValor;
import java.util.Scanner;

public class proceso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Hola! este es un juego de adivinar el número oculto");
        System.out.println("....................................................");
        System.out.println("Deberá escribir 3 números enteros entre 0 y 9");
        System.out.println("....................................................");
        System.out.println("Los números se suman y el resultado definirá si se halló el valor correcto");
        System.out.println("....................................................");
        System.out.println("Intente adivinar el valor oculto");
        System.out.println("....................................................");
        System.out.println("Solo tiene 3 intentos");
        System.out.println("....................................................");
        
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int suma = a + b + c;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese su primer número: ");
            int n1 = scanner.nextInt();
            System.out.print("Ingrese su segundo número: ");
            int n2 = scanner.nextInt();
            System.out.print("Ingrese su tercer número: ");
            int n3 = scanner.nextInt();
            if (n1 + n2 + n3 == suma) {
                System.out.println("Felicidades! Ha adivinado el valor oculto");    
                break;
            } else {
                System.out.println("Su intento es incorrecto");
            }
        }
        System.out.println("Se acabaron los intentos");
        System.out.println("El valor oculto era: " + suma);
        scanner.close();

	}

}