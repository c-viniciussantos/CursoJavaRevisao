package s08_IntroPOO.entities;

public class Produto {

	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produto() {
	}

	public Produto(String nome, Double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double valorTotalEstoque() {
		return quantidade * preco;
	}
	
	public void addProduto(Integer quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(Integer quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return  "Dados do estoque "
				+ "| Produto: "+ nome
				+ "| Preco R$%.2f |"+ preco
				+ "| Qtd.Estoque: "+ quantidade
				+ "| Valor Total = R$%.2f |"+ valorTotalEstoque();
	}
	
	
}
