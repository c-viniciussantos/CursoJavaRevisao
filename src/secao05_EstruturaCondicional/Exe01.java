package secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("Numero negativo!");
		} else {
			System.out.println("Numero positivo!");
		}
		
		sc.close();
	}

}
