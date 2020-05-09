import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		int C = 1, NUM = 1, factorial = 1;
		
		System.out.println("INGRESE NÚMERO:  ");
		NUM = Mark.nextInt();
		
		while ( C <= NUM) {
			factorial *= C; 
			//factorial = * c;
			C++;
		}

		System.out.println("EL FACTORIAL DE  " + NUM + " ES: "+ factorial);

	}
}
