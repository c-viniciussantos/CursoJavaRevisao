package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa_Conta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		conta.menu();
		
		sc.close();
	}

}
