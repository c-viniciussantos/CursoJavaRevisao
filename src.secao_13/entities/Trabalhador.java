package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Experiencia;

public class Trabalhador {

	private String nome;
	private Experiencia level;
	private Double salario;

	// Declarando composição
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();

	public Trabalhador() {
	}

	// No construtor não pode ter atributos que são listas, ela deve ser iniciada
	// quando for declarado a variavel
	public Trabalhador(String nome, Experiencia level, Double salario, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Experiencia getLevel() {
		return level;
	}

	public void setLevel(Experiencia level) {
		this.level = level;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(Contrato contrato) {
		contratos.remove(contrato);
	}

	public Double renda(int mes, int ano) {

		Double soma = salario;
		Calendar cal = Calendar.getInstance();

		for (Contrato ctt : contratos) {
			cal.setTime(ctt.getData());
			int year = cal.get(Calendar.YEAR);
			int month = 1 + cal.get(Calendar.MONTH);
			if (mes == month && ano == year) {
				soma += ctt.valorTotal();
			}
		}
		return soma;
	}
}
