package secao04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = sc.nextInt();
		System.out.print("Digite o valor de D: ");
		int d = sc.nextInt();
		
		int dif = (a * b - c * d);
		
		System.out.println("Diferenca: "+ dif);

		sc.close();
	}

}
