package secao04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio de um circulo: ");
		double raio = sc.nextDouble();
		
		double area = pi * (raio * raio);
		
		System.out.printf("A area de um circulo eh: %.4f", area);
	
		sc.close();
	}

}
