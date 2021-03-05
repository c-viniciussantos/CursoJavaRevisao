package entities;

import java.util.Date;

public class Contrato {

	private Date date;
	private Double valorHora;
	private Integer horas;
	
	public Contrato() {
	}

	public Contrato(Date date, Double valorHora, Integer horas) {
		this.date = date;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double totalValue() {
		return valorHora * horas;
	}
}
