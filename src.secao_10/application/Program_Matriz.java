package application;

import java.util.Scanner;

public class Program_Matriz {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
		 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int linha = 0; linha < n; linha++) {
			for (int coluna = 0; coluna < n; coluna++) {
				mat[linha][coluna] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");
		// mat.length Percorrer ate a ultima posição da matriz
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int contador = 0;

		// mat.length Percorrer ate a ultima posição da linha
		for (int linha = 0; linha < mat.length; linha++) {
			// mat.length Percorrer ate a ultima posição da coluna
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
				if (mat[linha][coluna] < 0) {
					contador++;
				}
			}
		}

		System.out.println("Numeros negativos = " + contador);

		sc.close();
	}

}
