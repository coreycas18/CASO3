import java.util.Scanner;

public class CASO6 {
//creado por COREY CASTILLO
	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		String Continuar = "S", nombre = "", estado = "";
		int edad = 0, c = 0,c_aptos = 0;
		while (Continuar.contentEquals("S")|| Continuar.equals("s")) {
			c++;
			System.out.println("REGISTRO N. " + c);;
			System.out.println("**************");
			
			System.out.println("NOMBRE: ");
			nombre = Mark.nextLine();
			
			System.out.println("EDAD: ");
			edad = Mark.nextInt();
			
			if (edad >= 18) {
				estado = "APTO PARA VOTAR";
				
				c_aptos++;
			}
			else
				estado = "Menor de Edad";
			
				System.out.println("¿DESEA CONTINUAR <S/N>?: " );
			Continuar = Mark.nextLine();
			
		}
			System.out.println("****RESUMEN****");
			System.out.println("PARTICIPANTES: .. *** " + c);
			System.out.println("APTOS PARA VOTAR: ****  " + c_aptos );
			
			
			
	}	
}
