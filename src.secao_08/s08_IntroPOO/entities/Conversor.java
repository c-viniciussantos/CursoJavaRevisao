package s08_IntroPOO.entities;


public class Conversor {

	static final Double DOLAR = 3.10;
	
	static final Double TAXA = 6.00;
	
	public Double conversorReais(Double valor) {
		valor = (valor / DOLAR) - TAXA;
		return valor;
	}
	
	public void quantoReais() {
		
	}
}
