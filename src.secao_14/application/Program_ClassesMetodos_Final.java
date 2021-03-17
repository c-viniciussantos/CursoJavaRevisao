package application;

public final class Program_ClassesMetodos_Final {

	public static void main(String[] args) {

		 /*Palavra chave: final
		 � Classe: evita que a classe seja herdada
		 public final class ContaPoupanca {
		 
		 � M�todo: evita que o m�todo sob seja sobreposto
		 Suponha que voc� queira evitar que sejam criadas subclasses de ContaPoupanca
		 public final void saque()*/
		
		//Pra qu�?
		
		/*� Seguran�a: dependendo das regras do neg�cio, �s vezes � desej�vel
		garantir que uma classe n�o seja herdada, ou que um m�todo n�o
		seja sobreposto.
		� Geralmente conv�m acrescentar final em m�todos sobrepostos, pois
		sobreposi��es m�ltiplas podem ser uma porta de entrada para
		inconsist�ncias
		� Performance: atributos de tipo de uma classe final s�o analisados de
		forma mais r�pida em tempo de execu��o.
		� Exemplo cl�ssico: String*/

	}

}
