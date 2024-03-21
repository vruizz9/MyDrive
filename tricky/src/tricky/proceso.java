package tricky;

import java.util.Scanner;

public class proceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = 3; 
        int n = 3; 

        char[][] matriz = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        System.out.println("Tablero inicial:");
        imprimirMatriz(matriz);

        boolean finJuego = false;
        char jugadorActual = 'X';
        while (!finJuego) {
            System.out.println("Turno del jugador " + jugadorActual + ". Ingrese la fila y columna donde desea colocar su ficha (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= m || col < 0 || col >= n || matriz[row][col] != ' ') {
                System.out.println("Movimiento invalido. Intente de nuevo.");
                continue;
            }

            matriz[row][col] = jugadorActual;
            imprimirMatriz(matriz);

            if (checkWin(matriz, jugadorActual)) {
                System.out.println("El jugador " + jugadorActual + " ha ganado!");
                finJuego = true;
            } else if (checkDraw(matriz)) {
                System.out.println("Empate!");
                finJuego = true;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static void imprimirMatriz(char[][] matriz) {
        System.out.println("-------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean checkWin(char[][] matriz, char player) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == player && matriz[i][1] == player && matriz[i][2] == player) {
                return true; 
            }
            if (matriz[0][i] == player && matriz[1][i] == player && matriz[2][i] == player) {
                return true; 
            }
        }

        if ((matriz[0][0] == player && matriz[1][1] == player && matriz[2][2] == player) ||
            (matriz[0][2] == player && matriz[1][1] == player && matriz[2][0] == player)) {
            return true; 
        }

        return false;
    }

    private static boolean checkDraw(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }
}
