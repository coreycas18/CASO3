import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		int NUM = 0;
		int c = 1;
		int suma = 0;
		
		System.out.println("INGRESE NÚMERO:  ");
		NUM = Mark.nextInt();
		
		
		while ( c <= NUM ) {
			suma += c;
			// SUMA = SUMA + C;
			c++;
		}
		System.out.println("LA SUMATORIA DE " + NUM + " ES: " + suma);

	}

}
