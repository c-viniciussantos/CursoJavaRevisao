package application;

public final class Program_ClassesMetodos_Final {

	public static void main(String[] args) {

		 /*Palavra chave: final
		 • Classe: evita que a classe seja herdada
		 public final class ContaPoupanca {
		 
		 • Método: evita que o método sob seja sobreposto
		 Suponha que você queira evitar que sejam criadas subclasses de ContaPoupanca
		 public final void saque()*/
		
		//Pra quê?
		
		/*• Segurança: dependendo das regras do negócio, às vezes é desejável
		garantir que uma classe não seja herdada, ou que um método não
		seja sobreposto.
		• Geralmente convém acrescentar final em métodos sobrepostos, pois
		sobreposições múltiplas podem ser uma porta de entrada para
		inconsistências
		• Performance: atributos de tipo de uma classe final são analisados de
		forma mais rápida em tempo de execução.
		• Exemplo clássico: String*/

	}

}
