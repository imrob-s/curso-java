package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int C = sc.nextInt();
		int matrix[][] = new int[L][C];
		// Escrevendo a Matriz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Numero a ser encontrado na matriz
		int X = sc.nextInt();
		// Mostrar posição encontrada e numeros em volta
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if  (matrix[i][j] == X) {
					System.out.println("Position " + i +"," + j+ ":");
					if (j > 0) {
					System.out.println("Left: " + matrix[i][j-1]);
					}
					if (j+1 < matrix[i].length) {
					System.out.println("Right: "+ matrix[i][j+1]);
					}
					if (i > 0) {
					System.out.println("Up: " + matrix[i-1][j]);
					}
					if (i+1 < matrix.length)
					System.out.println("Down: " + matrix[i+1][j]);					
				}
			}
		}
		
		
		
		sc.close();
	}

}
