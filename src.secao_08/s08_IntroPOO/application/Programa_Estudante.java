package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Estudante;

public class Programa_Estudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		
		System.out.print("Nome do estudante: ");
		est.setNome(sc.nextLine());
		
		System.out.print("Nota 1: ");
		est.setNota1(sc.nextDouble());
		
		System.out.print("Nota 2: ");
		est.setNota2(sc.nextDouble());
		
		System.out.print("Nota 3: ");
		est.setNota3(sc.nextDouble());
		
		System.out.printf("Media final: %.2f%n", est.mediaFinal());
		
		if(est.mediaFinal() < 60.0) {
			System.out.println("Falhou!");
			System.out.printf("Faltou %.2f", est.minimoPontos());
		} else {
			System.out.println("Passou!");
		}
		
		sc.close();
	}

}
