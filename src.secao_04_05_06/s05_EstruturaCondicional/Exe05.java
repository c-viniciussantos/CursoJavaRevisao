package s05_EstruturaCondicional;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("       BEM VINDO A LANCHONETE        ");
		System.out.println("-------------------------------------");
		System.out.println("CODIGO |      ITEM       |    VALOR  ");
		System.out.println("- 1 -        HOTDOG           R$4.00 ");
		System.out.println("- 2 -        X-SALADA         R$4.50 ");
		System.out.println("- 3 -        X-BACON          R$5.00 ");
		System.out.println("- 4 -        TORRADA          R$2.00 ");
		System.out.println("- 5 -        REFRIGERANTE     R$1.50 ");
		System.out.println("-------------------------------------");
		System.out.print("Digite a opcao desejada: ");
		int op = sc.nextInt();
		System.out.print("Quantos vai querer?: ");
		int qtd = sc.nextInt();
		double preco = 0.00;
		
		System.out.println();
		
		switch (op) {
		case 1: preco = 4.00 * qtd; System.out.printf("Total a pagar: R$ %.2f", preco); break;
		case 2: preco = 4.50 * qtd; System.out.printf("Total a pagar: R$ %.2f", preco); break;
		case 3: preco = 5.00 * qtd; System.out.printf("Total a pagar: R$ %.2f", preco); break;
		case 4: preco = 2.00 * qtd; System.out.printf("Total a pagar: R$ %.2f", preco); break;
		case 5: preco = 1.50 * qtd; System.out.printf("Total a pagar: R$ %.2f", preco); break;
		default: System.out.println("Opcao invalida!!"); break;
		}
		
		sc.close();
	}

}
