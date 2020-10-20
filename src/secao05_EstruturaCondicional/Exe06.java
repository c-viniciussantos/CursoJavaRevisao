package secao05_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		/*Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
		nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);				
			
		System.out.print("Digite um numero: ");
		double num = sc.nextDouble();
		
		if(num <= 25.00 && num >= 0.00) {
			System.out.println("Intervalo [0,25]");
		} else if(num > 25.00 && num < 100.0) {
			System.out.println("Intervalo [25,50]");
		} else if(num >= 100.0) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
