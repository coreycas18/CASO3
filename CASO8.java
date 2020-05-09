import java.util.Scanner;

public class CASO8 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		System.out.println("Ingrese Numero:  ");
		int NUM  = Mark.nextInt();
		
		for(int C = 1; C <= 15; C++) {
			System.out.println( NUM + " * "+ C+ " = "+ NUM * C);
	}

}
}
