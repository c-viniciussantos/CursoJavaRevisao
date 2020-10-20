package secao04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Qual codigo do produto 1: ");
			int id1 = sc.nextInt();
			
			System.out.print("Quantas unidades do produto 1: ");
			int qtd1 = sc.nextInt();
			
			System.out.print("Qual valor do produto 1: ");
			double preco1 = sc.nextDouble();
			
			System.out.print("Qual codigo do produto 2: ");
			int id2 = sc.nextInt();
			
			System.out.print("Quantas unidades do produto 2: ");
			int qtd2 = sc.nextInt();
			
			System.out.print("Qual valor do produto 2: ");
			double preco2 = sc.nextDouble();
			
			double total = (qtd1 * preco1) + (qtd2 * preco2);
			
			System.out.printf("Total a pagar R$ %.2f", total);
		
		sc.close();
	}

}
