package s04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a matricula do funcionario: ");
		int id = sc.nextInt();
		
		System.out.print("Digite o valor pago por hora: ");
		double sal = sc.nextDouble();
		
		System.out.print("Digite quantas horas trabalhadas no mes:  ");
		int hr = sc.nextInt();
		
		double nSal = (sal * hr); 
		
		System.out.printf("O salario do funcionario com matricula %d �: R$ %.2f", id, nSal);
		
		sc.close();
	}

}
