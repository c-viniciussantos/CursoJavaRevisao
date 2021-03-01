package application;

import java.util.Scanner;

public class Program_Exe_Matriz {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo n�meros inteiros, podendo haver
		 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz. Para
		 * cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int linha = 0; linha < mat.length; linha++) {
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
				mat[linha][coluna] = sc.nextInt();
			}
		}

		System.out.print("Digite o numero para procurar: ");
		int x = sc.nextInt();

		for (int linha = 0; linha < mat.length; linha++) {
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
				if (mat[linha][coluna] == x) {
					System.out.println("Posicao: " + linha + "," + coluna + ":");

					if (coluna > 0) {
						System.out.println("Esquerda: " + mat[linha][coluna - 1]);
					}

					if (linha > 0) {
						System.out.println("Acima: " + mat[linha-1][coluna]);
					}

					if (coluna < mat[linha].length - 1) {
						System.out.println("Direita: " + mat[linha][coluna + 1]);
					}

					if (linha < mat.length - 1) {
						System.out.println("Abaixo: " + mat[linha + 1][coluna]);
					}
				}

			}
		}

		sc.close();
	}

}
