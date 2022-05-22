package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoImportado;
import entities.ProdutoUsado;
import entities.Produto_ExeFixacao;

public class Program_ExeFixacao {

	/*
	 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio).
	 * Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem que
	 * foram digitados.
	 *
	 * Todo produto possui nome e pre�o. Produtos importados possuem taxa de
	 * alfand�ga, e, produtos usados possuem data de fabrica��o. Estes dados
	 * espec�ficos devem ser acrescentados na etiqueta de pre�o conforme exemplo
	 * (proxima pagina). Para produtos importados, a taxa e alfandega deve ser
	 * acrescentada ao pre�o final do produto.
	 */

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int statusProd = 0;
		Boolean statusProdOk = false;
		String nome = "";
		Double preco = 0.00;
		Double taxa;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFabricacao = new Date();
		String dataFormat;
		
		List<Produto_ExeFixacao> produtos = new ArrayList<>();

		System.out.print("Quantos produtos v�o processar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Adicione os dados do Produto #" + i + " abaixo!\n");

			while (nome == ""){
				System.out.print("Nome: ");
				nome = sc.next();
				
				if(nome == "") {
					System.out.println("Precisa inserir um nome valido!");
				}
			}
			
			while (preco == 0.00){
				System.out.print("Pre�o: $");
				preco = sc.nextDouble();
				
				if(preco <= 0.00) {
					System.out.println("O Pre�o n�o pode ser menor ou igual a 0,00");
				}
			}
			
			while (!statusProdOk) {
				System.out.print("(1-COMUM, \n" 
								+ "2-USADO, \n" 
								+ "3-IMPORTADO \n" 
								+ "Qual status do produto atual?: ");
				statusProd = sc.nextInt();

				if (statusProd == 1) {
					statusProdOk = true;
				} else if (statusProd == 2) {
					statusProdOk = true;
				} else if (statusProd == 3) {
					statusProdOk = true;
				} else {
					System.out.println("Invalido!");
				}
			}
			
			if(statusProd == 2) {
				System.out.print("Qual � a Data de Fabrica��o? (DD/MM/YYYY): ");
				dataFabricacao = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
				
			} else if(statusProd == 3) {
				System.out.print("Qual foi o pre�o da taxa de Alfandega? R$");
				taxa = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxa));
				
			} else {
				produtos.add(new Produto_ExeFixacao(nome, preco));
				
			}
		}
		
		System.out.println();
		System.out.println("Pre�o tags");
		
		for(Produto_ExeFixacao produto : produtos) {
			System.out.println(produto.precoTag());
		}

		sc.close();
	}

}
