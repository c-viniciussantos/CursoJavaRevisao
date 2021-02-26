package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program_ExeLista {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
		N funcion�rios. N�o deve haver repeti��o de id.
		Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
		Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
		mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
		conforme exemplos.
		Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
		ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
		aumento por porcentagem dada.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios func = new Funcionarios();
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios voc� quer registrar?: ");
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
			System.out.println("Esse Id n�o esta cadastrado!");
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

