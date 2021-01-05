package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Empregado;

public class Programa_Empregado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.print("Informe o nome do empregado: ");
		emp.setNome(sc.nextLine());
		
		System.out.print("Informe o salario bruto: R$");
		emp.setSalarioBruto(sc.nextDouble());
		
		System.out.print("Informe o valor da taxa: R$");
		emp.setTaxa(sc.nextDouble());
		
		System.out.printf("Empregado: %s, R$%.2f%n ", emp.getNome(), emp.novoSalario());
		System.out.println();
		System.out.print("Qual a porcentagem que vai incrementar?: ");
		double porcentagem = sc.nextDouble();
		emp.AlterarSalario(porcentagem);
		System.out.println();
		System.out.printf("Dados atualizados!: %s, R$%.2f", emp.getNome(), emp.getSalarioBruto()
				);
		
		
		
		sc.close();
	}

}
