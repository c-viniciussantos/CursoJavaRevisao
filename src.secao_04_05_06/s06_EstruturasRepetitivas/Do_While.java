package s06_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {

		/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
		Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
		programa.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char ch = 's';
		
		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			
			double f = 9.0 * c  / 5.0 + 32.0;
			
			System.out.printf("Equivalente a Fahrenheit: %.2f%n", f);
			
			System.out.println();
			System.out.print("Deseja repetir? (s/n): ");
			ch = sc.next().charAt(0);
			
		} while(ch == 's');
		
		sc.close();
	}

}
