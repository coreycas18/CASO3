import java.util.Scanner;

public class CASO5 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner( System.in);
		
		int n = 1, c = 1, menor = 100;
		
		while (c <= 5) {
			System.out.println("INGRESE NÚMERO " + c + ": ");
			n = Mark.nextInt();
			
			if (n < menor)
				menor = n;
			
			c++;	
		}
		System.out.println("EL NÚMERO MENOR ES : " + menor);

	}

}
