package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeFor05 {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero para saber o fatorial: ");
		int n = sc.nextInt();

		if (n == 0) {
			System.out.println("Fatorial = 1");
		} else {
			
			int fat = 1;
			
			for (int i = 1; i <= n; i++) {
				fat *= 1;
			}
			
			System.out.println("Fatorial = "+ fat);
			
		}

		sc.close();
	}

}
