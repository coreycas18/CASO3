import java.util.Scanner;


public class caso4 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner( System.in);
		
		int n = 0, c = 1, mayor = 0;
		
		while (c <= 4) {
			System.out.println("INGRESE NÚMERO " + c + ": ");
			n = Mark.nextInt();
			
			if (n > mayor)
				mayor = n;
			
			c++;	
		}
		System.out.println("EL NÚMERO MAYOR ES : " + mayor);

	}

}
