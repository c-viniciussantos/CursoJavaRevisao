package entities;

public class Produto_ExeFixacao {

	private String nome;
	private Double preco;

	public Produto_ExeFixacao(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String precoTag() {
		return nome 
				+ " $ " 
				+ String.format("%.2f", preco);
	}
}
