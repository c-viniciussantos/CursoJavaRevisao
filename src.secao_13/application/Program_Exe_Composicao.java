package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.Experiencia;

public class Program_Exe_Composicao {

	public static void main(String[] args) throws ParseException {
		
		/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
		do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Seja bem vindo, vamos começar...");
		
		System.out.println();
		
		System.out.print("Qual o Departamento: ");
		String departamento = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Experiencia (JUNIOR; PLENO; SENIOR) ");
		String level = sc.nextLine();
		
		System.out.print("Salario: ");
		Double salario = sc.nextDouble();
		
		Trabalhador worker = new Trabalhador(nome, Experiencia.valueOf(level), salario, new Departamento(departamento));
		
		System.out.print("Quantos contratos quer cadastrar desse funcionario? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os dados do contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(dataContrato, valorHora, horas);
			worker.addContrato(contrato);
		}
		
		System.out.println();
		
		System.out.print("Insira mes e ano para calcular a Renda (MM/YYYY): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + worker.getNome());
		System.out.println("Departamento: " + worker.getDepartamento().getNome() + " Experiencia: "+ worker.getLevel());
		System.out.println("Renda: " + mesAno + ": " + String.format("%.2f", worker.renda(mes, ano)));
		
		sc.close();
	}

}
