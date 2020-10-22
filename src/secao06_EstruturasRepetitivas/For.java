package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero p/ saber a tabuada: ");
		int x = sc.nextInt();
		int soma = 0;
		
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			soma = x * i;
			System.out.println(x+" X "+ i +" = "+ soma);
		}
		
		sc.close();
	}

}
