package secao04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//01 - Faça um programa para ler dois valores decimais, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.

		double soma, div, mult, sub, x, y;
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		System.out.print("Digite outro numero: ");
		y = sc.nextInt();
		
		soma = x + y;
		sub = x - y;
		div = x / y;
		mult = x * y;
		System.out.println();
		System.out.printf("A soma: %.2f%n", soma);
		System.out.printf("A divisão: %.2f%n", div);
		System.out.printf("A multiplicação: %.2f%n", mult);
		System.out.printf("A subtração: %.2f.", sub);	
		
		
		sc.close();
	}
}
