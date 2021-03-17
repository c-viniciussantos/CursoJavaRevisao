package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program_ExeResolvido {

	public static void main(String[] args) {

		/*Uma empresa possui funcion�rios pr�prios e terceirizados.
		Para cada funcion�rio, deseja-se registrar nome, horas
		trabalhadas e valor por hora. Funcion�rios terceirizado
		possuem ainda uma despesa adicional.
		O pagamento dos funcion�rios corresponde ao valor da hora
		multiplicado pelas horas trabalhadas, sendo que os
		funcion�rios terceirizados ainda recebem um b�nus
		correspondente a 110% de sua despesa adicional.
		Fazer um programa para ler os dados de N funcion�rios (N
		fornecido pelo usu�rio) e armazen�-los em uma lista. Depois
		de ler todos os dados, mostrar nome e pagamento de cada
		funcion�rio na mesma ordem em que foram digitados.
		Construa o programa conforme projeto ao lado.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Digite o numero de Funcionarios: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionario #"+ i);
			
			System.out.print("Terceirizado? (s/n): ");
			char op = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			System.out.print("Valor por Hora: R$ ");
			Double valorHora = sc.nextDouble();
			
			if(op == 's') {
				System.out.print("Cobran�a adicional: R$ ");
				Double cobrancaAdicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, horas, valorHora, cobrancaAdicional));
			} else if(op == 'n') {
				list.add(new Funcionario(nome, horas, valorHora));
			} else {
				System.out.println("Op��o invalida!");
			}
		}
		
		System.out.println();
		
		System.out.println("Pagamentos: ");
		for(Funcionario func : list) {
			System.out.println(func.getNome() +" - R$ %.2f"+ func.pagamento());
		}
		
		sc.close();
	}

}
