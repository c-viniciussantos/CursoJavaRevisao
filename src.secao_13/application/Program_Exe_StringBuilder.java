package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class Program_Exe_StringBuilder {

	public static void main(String[] args) throws ParseException {
		
		//Composição 2
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Eric -- Foi uma otima viagem!!");
		Comentario c2 = new Comentario("Bea -- Ja estou com saudades desse lugar T-T");
		
		Post p1 = new Post(
							sdf.parse("09/06/1997 10:33:00"), 
							"Curtindo em Amsterdam", 
							"Visita em um país maravilhoso", 
							33);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1.toString());
		
		System.out.println();
		
		Comentario c3 = new Comentario("Maria Joana -- Quero bolo hein!!");
		Comentario c4 = new Comentario("Edson -- Gostou do presente? haha");
		
		Post p2 = new Post(
				sdf.parse("12/03/1999 22:22:00"), 
				"Feliz aniversario", 
				"Felicidades", 
				18);
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p2.toString());
	}
}
