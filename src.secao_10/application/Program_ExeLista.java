package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program_ExeLista {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
		N funcionários. Não deve haver repetição de id.
		Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
		Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
		mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		conforme exemplos.
		Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
		aumento por porcentagem dada.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios func = new Funcionarios();
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios você quer registrar?: ");
		int qtd = sc.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.print("Funcionario #"+ i +": ");
			
			System.out.print("Id: ");
			func.setId(sc.nextInt());
			while(hasId(list, func.getId())) {
				System.out.print("Ja existe esse Id. Tente novamente: ");
				func.setId(sc.nextInt());
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			func.setNome(sc.nextLine());
			
			System.out.print("Salario R$");
			func.setSalario(sc.nextDouble());
			
			list.add(new Funcionarios(func.getId(), func.getNome(), func.getSalario()));
		}
		
		System.out.println();
		System.out.print("Informe o Id do empregado que vai receber o aumento: ");
		int id = sc.nextInt();
		
		func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null) {
			System.out.println("Esse Id não esta cadastrado!");
		} else {
			System.out.print("Entre com a porcentagem do aumento: ");
			Double pct = sc.nextDouble();
			func.aumentoSal(pct);
		}
		
		System.out.println();

		System.out.println("Lista dos funcionarios atualizado!");
		for(Funcionarios obj: list) {
			System.out.println(obj.toString());
		}
		
		sc.close();
	}

	private static boolean hasId(List<Funcionarios> list, int id) {
		Funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
		}
	

}

