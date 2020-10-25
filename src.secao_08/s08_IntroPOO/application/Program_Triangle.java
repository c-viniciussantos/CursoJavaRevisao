package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Triangulo;

public class Program_Triangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		
		System.out.println("Digite as medidas do triangulo Y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		Double medX = x.calculaArea();
		Double medY = y.calculaArea();
		
		System.out.println("Medidas do triangulo X = "+ medX);
		System.out.println("Medidas do triangulo Y = "+ medY);
		
		sc.close();
	}

}
