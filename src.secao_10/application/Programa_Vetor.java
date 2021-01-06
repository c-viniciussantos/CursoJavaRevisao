package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantas vezes quer repetir o ciclo: ");
		int n = sc.nextInt();
		double media = 0.0;
		double[] vect = new double[n];
		
		for(int i=0; i < n; i++ ) {
			System.out.print("Digite o valor: ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			media += vect[i];
		}
		
		double total = media / n;	
		
		
		System.out.printf("Media = %.2f", total);
		sc.close();
	}

}
