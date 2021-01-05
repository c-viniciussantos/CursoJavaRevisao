package entities;

public class Construtor {

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
	
	
	
}
