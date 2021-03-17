package application;

import entities.ContaEmpresarial;
import entities.ContaPoupanca;
import entities.Contas;

public class Program_Override {

	public static void main(String[] args) {

		//Sobreposição ou sobrescrita
		
	  /*• É a implementação de um método de uma superclasse na subclasse
		• É fortemente recomendável usar a anotação @Override em um método sobrescrito
		• Facilita a leitura e compreensão do código
		• Avisamos ao compilador (boa prática)*/
		
		/*Exercicio: Suponha que a operação de saque possui uma taxa no valor de 5.0. 
		Entretanto, se a conta for do tipo poupança, esta taxa não deve ser cobrada*/
		
		Contas conta1 = new Contas(1001, "Carlos", 1000.0);
		Contas conta2 = new ContaPoupanca(1002, "Vinicius", 1000.0, 0.01);
		
		conta1.saque(200.0);
		conta2.saque(200.0);
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println();
		
		//Palavra super
	  /*É possível chamar a implementação da superclasse usando a palavra super.
		Exemplo: suponha que, na classe ContaEmpresarial, a regra para saque seja realizar o
		saque normalmente da superclasse, e descontar mais 2.0.*/
		
		Contas conta3 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
		
		conta3.saque(200.0);
		
		System.out.println(conta3);

	}

}
