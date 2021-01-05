package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Conversor;

public class Programa_Conversor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto dolares voce quer comprar?: R$");
		double valor = sc.nextDouble();
		
		Conversor con = new Conversor();
		
		System.out.printf("Total em dolares que você comprou $%.2f", con.conversorReais(valor));
		
		sc.close();
	}

}
