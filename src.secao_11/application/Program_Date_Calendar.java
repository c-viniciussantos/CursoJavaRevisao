package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program_Date_Calendar {

	public static void main(String[] args) {
		
		//Cria um formato para a Data de acordo com o parametro
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Cria a data conforme o padrão ISO8601
		Date data = Date.from(Instant.parse("1997-06-09T16:20:13Z"));
		
		//Formata a data e apresenta
		System.out.println(sdf.format(data));
		
		//Cria um objeto Calendar
		Calendar cal = Calendar.getInstance();
		//Recebe a data
		cal.setTime(data);
		//Adiciona 3 horas ao dia
		cal.add(Calendar.HOUR_OF_DAY, 3);
		
		//Atualiza a variavel data
		data = cal.getTime();
		
		System.out.println(sdf.format(data));
		
		System.out.println("--------------------------------");
		
		//Obtendo uma unidade de tempo
		
		cal.setTime(data);
		int hora = cal.get(Calendar.HOUR);
		int minuto = cal.get(Calendar.MINUTE);
		int segundo = cal.get(Calendar.SECOND);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		//O mes começa a contar com "0" na memoria
		int mes = 1 + cal.get(Calendar.MONTH);
		int ano = cal.get(Calendar.YEAR);
		
		System.out.printf("Horas: %d:%d:%d Data: %d/%d/%d", hora, minuto, segundo, dia, mes, ano);
		
	}

}
