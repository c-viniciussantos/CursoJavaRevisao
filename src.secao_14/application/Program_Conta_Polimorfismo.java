package application;

import entities.ContaPoupanca;
import entities.Contas;

public class Program_Conta_Polimorfismo {

	public static void main(String[] args) {

		/*Em Programação Orientada a Objetos, polimorfismo é recurso que
		permite que variáveis de um mesmo tipo mais genérico possam
		apontar para objetos de tipos específicos diferentes, tendo assim
		comportamentos diferentes conforme cada tipo específico*/
		
		Contas conta = new Contas(3750, "Vinicius", 1600.0);
		Contas contaP = new ContaPoupanca(1234, "Maria", 1600.0, 0.01);
		
		conta.saque(200.0);
		contaP.saque(200.0);
		
		System.out.println(conta);
		System.out.println(contaP);
		
		//Importante entender
		
	  /*• A associação do tipo específico com o tipo genérico é feita em tempo de
		execução (upcasting).
		• O compilador não sabe para qual tipo específico a chamada do método
		saque está sendo feita (ele só sabe que são duas variáveis tipo Contas):*/

	}

}
