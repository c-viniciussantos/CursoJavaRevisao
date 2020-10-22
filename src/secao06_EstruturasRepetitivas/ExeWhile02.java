package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeWhile02 {

	public static void main(String[] args) {
		
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int y = sc.nextInt();
		
		while(x < 0 && y > 0) {
			System.out.println("Segundo"); break;
		}
		
		while(x > 0 && y > 0) {
			System.out.println("Primeiro"); break;
		}
		
		while(x < 0 && y < 0) {
			System.out.println("Terceiro"); break;
		}
		
		while(x > 0 && y < 0) {
			System.out.println("Quarto"); break;
		}
		
		while(x == 0 || y == 0) {
			break;
		}
		
		sc.close();
	}

}
