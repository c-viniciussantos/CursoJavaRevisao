package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Construtor;

public class Programa_Construtor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Pode chamar o construtor obrigando os parametros
		//Construtor cons1 = new Construtor("Exemplo 1", "Exemplo 2", "Exemplo 3", "Exemplo 4");
		
		//Pode chamar o construtor sem obrigar os parametros
		Construtor cons2 = new Construtor(); 
		
		//Pega as informações
		cons2.setExemplo1(sc.nextLine());
		cons2.setExemplo2(sc.nextLine());
		cons2.setExemplo3(sc.nextLine());
		cons2.setExemplo4(sc.nextLine());
		
		System.out.println();
		
		//Mostra as informações
		System.out.println(cons2.getExemplo1());
		System.out.println(cons2.getExemplo2());
		System.out.println(cons2.getExemplo3());
		System.out.println(cons2.getExemplo4());
		
		sc.close();
	}

}
