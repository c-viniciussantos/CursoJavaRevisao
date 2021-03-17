package entities;

public class ContaEmpresarial extends Contas{

	private Double limite;
	
	public ContaEmpresarial() {
		super();
	}

	//Herança - herdar os atributos de outra classe acrescentando 
	public ContaEmpresarial(Integer id, String titular, Double saldo, Double limite) {
		super(id, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void emprestimo(Double valor) {
		if(valor <= limite) {
			limite -= valor;
			deposito(valor);
		} else {
			System.out.println("Limite insulficiente!");
		}
	}
	
	@Override
	public void saque(Double valor) {
		if(valor <= saldo) {
			super.saque(valor);
			saldo -= 2.0;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	@Override
	public String toString() {
		return "ContaEmpresarial: "+ getTitular()
				+ "\nId: "+ getId()
				+ "\nSaldo da conta R$ "+ String.format("%.2f", getSaldo())
				+ "\nLimite disponivel R$ "+ limite;	
	}
}
