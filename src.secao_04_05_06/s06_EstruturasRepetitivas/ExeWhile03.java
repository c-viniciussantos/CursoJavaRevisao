package s06_EstruturasRepetitivas;

import java.util.Scanner;

public class ExeWhile03 {

	public static void main(String[] args) {

		/*Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
		um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
		4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
		que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
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
