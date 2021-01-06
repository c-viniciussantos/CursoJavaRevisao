package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa_Produto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		//vect[i] ou .length é a mesma coisa, ou seja a posição maxima do vetor
		for(int i=0; i<vect.length ; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / n;
		
		System.out.printf("Media = %.2f%n", media);
		
		sc.close();
	}

}
