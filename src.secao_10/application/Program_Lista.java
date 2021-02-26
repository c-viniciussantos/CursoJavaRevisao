package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_Lista {
	public static void main(String[] args) {
		
		//Cria um List instanciando uma classe ArrayList por conta que List é uma Interface
		List<String> list = new ArrayList<>();
		
		//Adiciona elementos a lista
		list.add("Carlos");
		list.add("Vinicius");
		list.add("dos");
		list.add("Santos");
		
		//Adiciona elementos em uma determinada posição
		list.add(2, "Vini");
		
		//Verifica o tamanho da lista
		System.out.println(list.size());
		
		//Percorre a lista e apresenta o elemento
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//Remove da lista apartir da inicial do elemento
		list.removeIf(x -> x.charAt(0) == 'C');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//Mosta a posição de um determinado elemento
		System.out.println("Index of Vinicius: " + list.indexOf("Vinicius"));
		System.out.println("Index of Santos: " + list.indexOf("Santos"));
		System.out.println("---------------------");
		
		//Cria uma List que retorna o resultado de um stream expressão lambda que filtra o elemento apartir de um predicate
		//Como um obj do tipo List não aceita stream é necessario converter com um collect para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//Cria uma variavel tipo String para receber todos os elementos da lista de acordo com o predicate do filter e se não encontra retorna null
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
	}
}
