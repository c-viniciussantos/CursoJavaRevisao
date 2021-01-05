package s08_IntroPOO.entities;

public class Retangulo{

	private double largura;
	private double altura;

	public Retangulo(){
	}

	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Double area(){
		return largura * altura;
	}

	public Double perimetro(){
		return 2 * (largura + altura);
	}

	public Double diagonal(){
		return Math.sqrt(largura * largura + altura * altura);
	}
}
