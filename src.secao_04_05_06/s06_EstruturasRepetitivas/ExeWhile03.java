package s06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeWhile03 {

	public static void main(String[] args) {

		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		exemplo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int alc = 0;
		int gas = 0;
		int die = 0;
		
		System.out.println("--------------------------");
		System.out.println(" BEM VINDO AO POSTO SHELL");
		System.out.println("--------------------------");
		System.out.println("CODIGO |      ITEM       ");
		System.out.println("- 1 -        ALCOOL      ");
		System.out.println("- 2 -        GASOLINA    ");
		System.out.println("- 3 -        DIESEL      ");
		System.out.println("- 4 -        FIM         ");
		System.out.println("-------------------------");
		System.out.print("Digite a opcao desejada: ");
		int op = sc.nextInt();
		
		while(op != 4) {
			if(op == 1) {
				alc++;
				System.out.print("Digite a opcao desejada: ");
				op = sc.nextInt();
			} else if(op == 2) {
				gas++;
				System.out.print("Digite a opcao desejada: ");
				op = sc.nextInt();
			} else if(op == 3) {
				die++;
				System.out.print("Digite a opcao desejada: ");
				op = sc.nextInt();
			} else {
				System.out.print("Digite a opcao desejada: ");
				op = sc.nextInt();
			}
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: "+ alc);
		System.out.println("Gasolina: "+ gas);
		System.out.println("Diesel: "+ die);
		
		sc.close();
	}

}
