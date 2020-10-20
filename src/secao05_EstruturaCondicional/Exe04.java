package secao05_EstruturaCondicional;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial do jogo: ");
		int hrInicio = sc.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		int hrFinal = sc.nextInt();
		
		int duracao;
		
		if(hrInicio < hrFinal) {
			duracao = hrFinal - hrInicio;
		} else {
			duracao = 24 - hrInicio + hrFinal;
		}
		
		System.out.println("Jogo durou: "+ duracao +" horas.");
		
		sc.close();
	}

}
