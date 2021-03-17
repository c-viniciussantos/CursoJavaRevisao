package application;

import entities.ContaPoupanca;
import entities.Contas;

public class Program_Conta_Polimorfismo {

	public static void main(String[] args) {

		/*Em Programa��o Orientada a Objetos, polimorfismo � recurso que
		permite que vari�veis de um mesmo tipo mais gen�rico possam
		apontar para objetos de tipos espec�ficos diferentes, tendo assim
		comportamentos diferentes conforme cada tipo espec�fico*/
		
		Contas conta = new Contas(3750, "Vinicius", 1600.0);
		Contas contaP = new ContaPoupanca(1234, "Maria", 1600.0, 0.01);
		
		conta.saque(200.0);
		contaP.saque(200.0);
		
		System.out.println(conta);
		System.out.println(contaP);
		
		//Importante entender
		
	  /*� A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de
		execu��o (upcasting).
		� O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo
		saque est� sendo feita (ele s� sabe que s�o duas vari�veis tipo Contas):*/

	}

}
