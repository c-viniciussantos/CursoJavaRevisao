package application;

import java.util.Scanner;

import entities.Quarto;

public class Program_Exe_Quarto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quarto quarto = new Quarto();

		String[] quartos = new String[10];
		
		System.out.print("Quantos estudantes vão se hospedar?: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			System.out.println("Cadastro #"+ i);
			System.out.print("Qual o quarto desejado? (0-9):");
			int x = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do estudante: ");
			quarto.setNome(sc.nextLine());
			
			System.out.print("Email do estudante: ");
			quarto.setEmail(sc.nextLine());
			
			quartos[x] = quarto.getNome() + " | " + quarto.getEmail();
			
		}
		
		for(int i=0; i <= quartos.length; i++) {
			if(quartos[i] == null) {
				System.out.println(i);
			} else {
			System.out.println(quartos[i]);
			}
		}
		
		sc.close();
	}

}
