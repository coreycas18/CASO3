import java.util.Scanner;

public class CASO7 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		String nombre = "";
		
		System.out.println("Ingrese Nombre:  ");
		nombre = Mark.nextLine();
		
		for(int N = 1; N <= 10; N++)
			System.out.println(N + " - BIENVENIDO " + nombre + " AL CURSO DE JAVA");
		
	}

}
