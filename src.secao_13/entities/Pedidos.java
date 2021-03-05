package entities;

import java.util.Date;

import entities.enums.StatusPedido;

public class Pedidos {

	private Integer id;
	private Date data;
	private StatusPedido status;
	
	public Pedidos() {
	}

	public Pedidos(Integer id, Date data, StatusPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido id= " + id + ", Data= " + data + ", status= " + status + ".";
	}	
}
