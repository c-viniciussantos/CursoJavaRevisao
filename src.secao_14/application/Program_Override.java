package application;

import entities.ContaEmpresarial;
import entities.ContaPoupanca;
import entities.Contas;

public class Program_Override {

	public static void main(String[] args) {

		//Sobreposi��o ou sobrescrita
		
	  /*� � a implementa��o de um m�todo de uma superclasse na subclasse
		� � fortemente recomend�vel usar a anota��o @Override em um m�todo sobrescrito
		� Facilita a leitura e compreens�o do c�digo
		� Avisamos ao compilador (boa pr�tica)*/
		
		/*Exercicio: Suponha que a opera��o de saque possui uma taxa no valor de 5.0. 
		Entretanto, se a conta for do tipo poupan�a, esta taxa n�o deve ser cobrada*/
		
		Contas conta1 = new Contas(1001, "Carlos", 1000.0);
		Contas conta2 = new ContaPoupanca(1002, "Vinicius", 1000.0, 0.01);
		
		conta1.saque(200.0);
		conta2.saque(200.0);
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println();
		
		//Palavra super
	  /*� poss�vel chamar a implementa��o da superclasse usando a palavra super.
		Exemplo: suponha que, na classe ContaEmpresarial, a regra para saque seja realizar o
		saque normalmente da superclasse, e descontar mais 2.0.*/
		
		Contas conta3 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
		
		conta3.saque(200.0);
		
		System.out.println(conta3);

	}

}
