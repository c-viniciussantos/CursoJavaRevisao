package secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("PAR!");
		} else {
			System.out.println("IMPAR!");
		}
		
		sc.close();
	}

}
