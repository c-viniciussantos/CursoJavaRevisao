package entities;

public class ProdutoImportado extends Produto_ExeFixacao{

	private Double taxaCustomizada;

	public ProdutoImportado(String nome, Double preco, Double taxaCustomizada) {
		super(nome, preco);
		this.taxaCustomizada = taxaCustomizada;
	}

	public Double getTaxaCustomizada() {
		return taxaCustomizada;
	}

	public void setTaxaCustomizada(Double taxaCustomizada) {
		this.taxaCustomizada = taxaCustomizada;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaCustomizada;
	}
	
	@Override
	public String precoTag() {
		return getNome()
						+ " $ " 
						+ String.format("%.2f", precoTotal())
						+ " (Customs fee: $ " 
						+ String.format("%.2f", taxaCustomizada)
						+ ")";
	}
}
