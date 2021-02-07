package s08_IntroPOO.entities;

public class Triangulo {

	private Double a;
	private Double b;
	private Double c;
	
	public Triangulo() {
	}

	public Triangulo(Double a, Double b, Double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}
	
	public Double calculaArea() {
		Double result = (a + b + c) / 2.0;
		Double area = Math.sqrt(result * (result - a) * (result - b) * (result - c));
		return area;
	}
	
}
