package application;

public class Program_For_Each {

	public static void main(String[] args) {

		String[] vect = new String[] {"Carlos", "Vinicius"};
		
		for (int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------");
		
		for (String forEach : vect) {
			System.out.println(forEach);
		}

	}

}
