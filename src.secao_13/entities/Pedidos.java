package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedidos {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private StatusPedido status;
	
	private Clientes cliente;
	
	private List<ItemPedidos> items = new ArrayList<>();
	
	public Pedidos() {
	}

	public Pedidos(Date momento, Clientes cliente) {
		this.momento = momento;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedidos> getItems() {
		return items;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemPedidos item) {
		items.add(item);
	}
	
	public void removeItem(ItemPedidos item) {
		items.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		for (ItemPedidos ip : items) {
			soma += ip.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) +"\n");
		sb.append("Status pedido: "+ status +"\n");
		sb.append("Cliente: \n");
		sb.append(cliente +"\n");
		sb.append("Items do pedido: \n");
		for (ItemPedidos ip : items) {
			sb.append(ip.toString() + "\n");
		}
		sb.append("\nPreço Total R$ ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
