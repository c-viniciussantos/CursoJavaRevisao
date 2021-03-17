package application;

import entities.ContaEmpresarial;
import entities.ContaPoupanca;
import entities.Contas;

public class Program_Upcasting_Downcasting {

	public static void main(String[] args) {

		Contas conta = new Contas(1001, "Alex", 0.0);
		ContaEmpresarial contaE = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

		/*
		  UPCASTING � Casting da subclasse para superclasse � Uso comum: polimorfismo*/
		
		// � possivel porque uma classe ContaEmpresarial e ContaPoupanca � uma classe
		// Conta.
		Contas account1 = contaE;
		Contas account2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Contas account3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);

		/*
		  DOWNCASTING � Casting da superclasse para subclasse � Palavra instanceof �
		  Uso comum: m�todos que recebem par�metros gen�ricos (ex: Equals)*/

		ContaEmpresarial account4 = (ContaEmpresarial) account2;
		account4.emprestimo(100.0);

		// Erro comum que pode acontecer e o compilador n�o avisa, uma ContaEmpresarial
		// n�o � uma ContaPoupanca.
		// ContaEmpresarial account5 = (ContaEmpresarial)account3;

		//condi��o para saber se � uma instancia de conta empresarial
		if (account3 instanceof ContaEmpresarial) {
			ContaEmpresarial account5 = (ContaEmpresarial) account3;
			account5.emprestimo(200.0);
			System.out.println("Emprestimo feito!");
		} 
		
		//condi��o para saber se � uma instancia de conta poupan�a
		if(account3 instanceof ContaPoupanca) {
			ContaPoupanca account5 = (ContaPoupanca)account3;
			account5.atualizaSaldo();
			System.out.println("Atualizado!!");
		}
	}

}
