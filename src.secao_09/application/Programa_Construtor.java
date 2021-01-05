package application;

import entities.Construtor;

public class Programa_Construtor {

	public static void main(String[] args) {

		//Pode chamar o construtor obrigando os parametros
		Construtor cons1 = new Construtor("Exemplo 1", "Exemplo 2", "Exemplo 3", "Exemplo 4");
		
		//Pode chamar o construtor sem obrigar os parametros
		Construtor cons2 = new Construtor(); 
	}

}
