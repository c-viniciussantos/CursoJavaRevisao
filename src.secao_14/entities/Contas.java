package entities;

public class Contas {

	private Integer id;
	private String titular;
	protected Double saldo;
	
	public Contas() {
	}

	public Contas(Integer id, String titular, Double saldo) {
		super();
		this.id = id;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(Double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta: "+ getTitular()
				+ "\nId: "+ getId()
				+ "\nSaldo da conta R$ "+ String.format("%.2f", getSaldo());
	}
}
