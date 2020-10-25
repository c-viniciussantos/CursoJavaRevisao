package s04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
		
		System.out.printf("O salario do funcionario com matricula %d é: R$ %.2f", id, nSal);
		
		sc.close();
	}

}
