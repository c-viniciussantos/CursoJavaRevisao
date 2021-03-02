package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_Datas {

	public static void main(String[] args) throws ParseException {

		//Forma simples de criar uma data e hora
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Forma de criar uma data no formato ISO 8601 e GMT sem atraso de -3hrs
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//É necessário colocar depois do parametro da classe que ela pode causar uma ParseException
		Date y1 = sdf1.parse("09/06/1997");
		Date y2 = sdf2.parse("09/06/1997 01:23:45");
		
		//Data e hora atual da maquina
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		//Data minima que o Date armazena é apartir de 01/01/1970 e como em São Paulo é -3:00 Horas então apresenta 31/12/1969 21hrs:
		Date z1 = new Date(0L);
		
		//Data de acordo com a ISO 8601
		Date iso = Date.from(Instant.parse("2021-03-02T01:08:00Z"));
		
		//Mostrar na tela sem formato
		System.out.println("y1 = "+ y1);
		System.out.println("y2 = "+ y2);
		System.out.println("x1 = "+ x1);
		System.out.println("x2 = "+ x2);
		System.out.println("z1 = "+ z1);
		System.out.println("ISO 8601 = "+ iso);
		
		System.out.println("----------------------------------------");
		
		//Com formato
		System.out.println("y1 = "+ sdf1.format(y1));
		System.out.println("y2 = "+ sdf2.format(y2));
		System.out.println("x1 = "+ sdf2.format(x1));
		System.out.println("x2 = "+ sdf2.format(x2));
		System.out.println("z1 = "+ sdf2.format(z1));
		System.out.println("ISO 8601 = "+ sdf2.format(iso));
		
		System.out.println("---------------------------------------");
		
		//Com horario GMT 0:00:00
		System.out.println("y1 = "+ sdf3.format(y1));
		System.out.println("y2 = "+ sdf3.format(y2));
		System.out.println("x1 = "+ sdf3.format(x1));
		System.out.println("x2 = "+ sdf3.format(x2));
		System.out.println("z1 = "+ sdf3.format(z1));
		System.out.println("ISO 8601 = "+ sdf3.format(iso));

	}

}
