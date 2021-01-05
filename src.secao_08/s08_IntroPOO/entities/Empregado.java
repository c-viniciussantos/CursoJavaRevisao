package s08_IntroPOO.entities;

public class Empregado {

	private String nome;
	private Double salarioBruto;
	private Double taxa;
	
	public Empregado() {
	}

	public Empregado(String nome, Double salarioBruto, Double taxa) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double novoSalario() {
		return salarioBruto -= taxa;
	}
	
	public void AlterarSalario(Double porcentagem) {
		 salarioBruto += (novoSalario() / 100.0) * porcentagem ;
	}
}
