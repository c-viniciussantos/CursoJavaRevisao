package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeFor02 {

	public static void main(String[] args) {
		
		/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
		essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

		Scanner sc = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		
		for(int i = 1; i <= 6; i++) {
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println();
		System.out.println("in: "+ in);
		System.out.println("out: "+ out);
		
		sc.close();
	}
}
