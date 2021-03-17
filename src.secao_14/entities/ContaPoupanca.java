package entities;

public class ContaPoupanca extends Contas{

	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer id, String titular, Double saldo, Double taxaJuros) {
		super(id, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(Double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
}
