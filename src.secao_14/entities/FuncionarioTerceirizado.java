package entities;

public class FuncionarioTerceirizado extends Funcionario{

	private Double cobrancaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double cobrancaAdicional) {
		super(nome, horas, valorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
	}
}
