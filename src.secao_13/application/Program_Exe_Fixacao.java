package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Clientes;
import entities.ItemPedidos;
import entities.Pedidos;
import entities.Produtos;
import entities.enums.StatusPedido;

public class Program_Exe_Fixacao {

	public static void main(String[] args) throws ParseException {

		/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
		sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
		o instante do sistema: new Date()*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/AAAA): ");
		Date nasc = sdf.parse(sc.next());
		
		Clientes cliente = new Clientes(nome, email, nasc);
		
		System.out.println();
		
		Pedidos pedido = new Pedidos(new Date(), cliente);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("(1-AGUARDANDO PGTO, "
						+ "2-PROCESSANDO, "
						+ "3-ENVIADO, "
						+ "4-ENTREGUE)"
						+ "Qual status do pedido atual?: ");
		
		int op = sc.nextInt();
		
		if(op == 1) {
			pedido.setStatus(StatusPedido.AGUARDANDO_PAGAMENTO);
		} else if(op == 2) {
			pedido.setStatus(StatusPedido.PROCESSANDO);
		} else if(op == 3) {
			pedido.setStatus(StatusPedido.ENVIADO);
		} else if(op == 4) {
			pedido.setStatus(StatusPedido.ENTREGUE);
		} else {
			System.out.println("Invalido!");
		}
		
		System.out.print("Quantos itens há neste pedido?: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			sc.nextLine();
			System.out.println("Pedido #"+ i);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preço R$ ");
			Double price = sc.nextDouble();
			
			Produtos prod = new Produtos(name, price);
			
			System.out.print("Quantidade: ");
			Integer qtd = sc.nextInt();
			
			ItemPedidos Items = new ItemPedidos(qtd, price, prod);
			
			pedido.addItem(Items);
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(pedido);
		
		
	}
}
