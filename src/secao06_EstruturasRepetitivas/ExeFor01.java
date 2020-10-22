package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeFor01 {

	public static void main(String[] args) {

		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		X, se for o caso.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		
		if(x % 2 == 0) {
			for(int i = 1;i < x; i+=2) {
				System.out.println(i);
			}
		} else {
			for(int i = 1;i <= x; i+=2) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
