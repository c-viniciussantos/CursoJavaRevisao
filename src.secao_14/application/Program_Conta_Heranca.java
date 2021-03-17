package application;

import entities.ContaEmpresarial;
import entities.Contas;

public class Program_Conta_Heranca {

	public static void main(String[] args) {
		
		/*É um tipo de associação que permite que uma classe herde todos dados e
		comportamentos de outra*/
		/*Vantagens
		• Reuso
		• Polimorfismo
		• Relação "é-um"*/
		
		Contas conta = new Contas(3750, "Vinicius", 1600.0);
		Contas contaE = new ContaEmpresarial(1234, "InfoSolution S.A", 5000.0, 10000.0);
		
		System.out.println(conta.toString());
		System.out.println(contaE.toString());
	}
}
