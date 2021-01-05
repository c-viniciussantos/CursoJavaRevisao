package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Retangulo;

public class Programa_Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo rect = new Retangulo();
		
		System.out.println("Entre com os dados para calcular o Retangulo: ");
		System.out.print("Informe a largura: ");
		rect.setLargura(sc.nextDouble());
		System.out.print("Informe a altura: ");
		rect.setAltura(sc.nextDouble());
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimetro = %.2f%n", rect.perimetro());
		System.out.printf("Diagonal = %.2f", rect.diagonal());
		
		sc.close();
	}
}
