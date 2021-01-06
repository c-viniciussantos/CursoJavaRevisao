package entities;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Conta {
	
	Scanner sc = new Scanner(System.in);

	private Integer idConta;
	private String nome;
	private Double saldo;
	
	private static Double TAXA = 5.00;
	
	public Conta() {
		
	}

	public Conta(Integer idConta, String nome, Double saldo) {
		this.idConta = idConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void abrirConta() {
		
		System.out.print("Informe o nome do titular da conta: ");
		setNome(sc.nextLine());
		sc.nextLine();
		System.out.print("Informe o numero da conta: ");
		setIdConta(sc.nextInt());
		System.out.print("Vai querer fazer um deposito inicial? (s/n): ");
		char op = sc.next().charAt(0);
		if(op == 's') {
			System.out.print("Informe o saldo que vai depositar R$ ");
			this.saldo = sc.nextDouble();
		} else {
			saldo = 0.00;
		}
		System.out.println("Conta criada com sucesso!");
		
		menu();
		
		sc.close();
	}
	
	public void saque() {
		System.out.print("Digite quanto quer sacar? Tem custo de taxa! R$ ");
		Double valor = sc.nextDouble();
		if(valor <= saldo) {
		saldo -= valor;
		saldo -= TAXA;
		System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insulficiente!");
		}
		
		menu();
		
		sc.close();
	}
	
	public void deposito() {
		System.out.print("Digite quanto quer depositar? R$ ");
		Double valor = sc.nextDouble();
		saldo += valor;
		
		menu();
		
		sc.close();
	}
	
	public void consultaConta() {
		System.out.print("Informe o numero da conta: ");
		int n = sc.nextInt();
		if(n == idConta) {
			System.out.println("Conta localizada!");
			sc.nextLine();
			System.out.printf("Titular: %s, Conta: %d, Saldo: %.2f%n", nome, idConta, saldo);
		} else {
			System.out.println("Conta invalida!");
		}
		
		menu();
	}
	
	public void menu() {
		int op = 1;
		do {
			System.out.println("1 - Quer abrir nova conta? ");
			System.out.println("2 - Quer consultar conta? ");
			System.out.println("3 - Quer fazer saque? ");
			System.out.println("4 - Quer fazer deposito? ");
			System.out.println("0 - Sair");
			System.out.print("Digite a sua opcao: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1: abrirConta() ; break;
			case 2: consultaConta(); break;
			case 3: saque(); break;
			case 4: deposito(); break;
			case 0: System.out.println("Saindo..."); break;
			default: System.out.println("Numero invalido"); break;
			}
		} while (op != 0);
	}
}
