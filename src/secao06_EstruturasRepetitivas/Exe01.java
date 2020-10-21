package secao06_EstruturasRepetitivas;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		System.out.print("Digite a senha para entrar: ");
		int tentativa = sc.nextInt();
		while(tentativa != senha) {
			System.out.println("Senha invalida!");
			System.out.print("Digite a senha novamente: ");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
