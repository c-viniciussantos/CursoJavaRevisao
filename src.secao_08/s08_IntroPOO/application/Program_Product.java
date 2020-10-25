package s08_IntroPOO.application;

import java.util.Locale;
import java.util.Scanner;

import s08_IntroPOO.entities.Produto;

public class Program_Product {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto prod = new Produto();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		prod.setNome(sc.nextLine());
		System.out.print("Preco: ");
		prod.setPreco(sc.nextDouble());
		System.out.print("Quantidade: ");
		prod.setQuantidade(sc.nextInt());
		
		System.out.println();
		System.out.println(prod);
		
		System.out.println();
		System.out.print("Quantos produtos quer adicionar ao estoque?: ");
		prod.addProduto(sc.nextInt());
		
		System.out.println();
		prod.toString();
		
		System.out.println();
		System.out.print("Entre com o numero de quantos produtos quer remover?: ");
		prod.removerProduto(sc.nextInt());
		
		System.out.println();
		prod.toString();
		
		sc.close();
	}
}
