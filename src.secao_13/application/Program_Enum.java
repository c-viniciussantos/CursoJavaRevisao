package application;

import java.util.Date;

import entities.Pedidos_Enum;
import entities.enums.StatusPedido;

public class Program_Enum {

	public static void main(String[] args) {
		
		/*� Enumera��es: � um tipo especial que serve para especificar de forma literal um
		conjunto de constantes relacionadas
		
		� Palavra chave em Java: enum
		
		� Vantagem: melhor sem�ntica, c�digo mais leg�vel e auxiliado pelo
		compilador
		
		� Refer�ncia: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html*/
		
		
		Pedidos_Enum pedido = new Pedidos_Enum(125, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		System.out.println("-------------------------------------");
		
		StatusPedido st1 = StatusPedido.ENVIADO;
		
		StatusPedido st2 = StatusPedido.valueOf("ENVIADO");
		
		System.out.println(st1);
		System.out.println(st2);
		
		
	}

}
