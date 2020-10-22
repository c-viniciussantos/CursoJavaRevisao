package secao06_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExeFor03 {

	public static void main(String[] args) {

		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		peso 5.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas vezes quer repetir a media?: ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.print("Digite a sequencia "+i+": ");
			double a = sc.nextDouble();
			System.out.print("Digite a sequencia "+i+": ");
			double b = sc.nextDouble();
			System.out.print("Digite a sequencia "+i+": ");
			double c = sc.nextDouble();
			
			
			double media = (a + b + c) / 3;
			
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		
		sc.close();
		
	}

}
