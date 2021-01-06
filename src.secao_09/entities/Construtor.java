package entities;

public class Construtor {

	/*Modificadores de acesso
	 * Private o membro só pode ser acessado na própria classe
	 * 
	 * (nada) o membro so pode ser acessado nas classes do mesmo pacote
	 * 
	 * Protected o membro so pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
	 * 
	 * Public o membro é acessado por todas as classes (ao menos que ele resida em um modulo diferente que não 
	 * exporte o pacote onde ele está */
	
	//Atributos
	private String exemplo1;
	private String exemplo2;
	private String exemplo3;
	private String exemplo4;
	
	//Construtor sem argumentos, boas práticas de programação
	//Ele é responsável por instanciar a classe
	public Construtor() {
	}
	
	//Construtor com argumentos, boas práticas de programação
	//Ele é responsável por instanciar a classe
	public Construtor(String exemplo1, String exemplo2, String exemplo3, String exemplo4) {
		this.exemplo1 = exemplo1;
		this.exemplo2 = exemplo2;
		this.exemplo3 = exemplo3;
		this.exemplo4 = exemplo4;
	}
	
	//Encapsulamento
	/* evita que outras classes alterem os atributos diretamente, em vez disso ele utilizam gets e sets*/

	public String getExemplo1() {
		return exemplo1;
	}

	public void setExemplo1(String exemplo1) {
		this.exemplo1 = exemplo1;
	}

	public String getExemplo2() {
		return exemplo2;
	}

	public void setExemplo2(String exemplo2) {
		this.exemplo2 = exemplo2;
	}

	public String getExemplo3() {
		return exemplo3;
	}

	public void setExemplo3(String exemplo3) {
		this.exemplo3 = exemplo3;
	}

	public String getExemplo4() {
		return exemplo4;
	}

	public void setExemplo4(String exemplo4) {
		this.exemplo4 = exemplo4;
	}
	
}
