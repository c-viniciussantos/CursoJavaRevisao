package secao04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite A: ");
		double a = sc.nextDouble();
		System.out.print("Digite B: ");
		double b = sc.nextDouble();
		System.out.print("Digite C: ");
		double c = sc.nextDouble();
		
		double tri = a * c / 2.00;
		double cir = 3.14159 * c * c;
		double tra = (a + b) / 2.00 * c;
		double qua = b * b;
		double ret = a * b;
		
		System.out.println();
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}

}
