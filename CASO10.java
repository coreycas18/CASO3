import java.util.Scanner;

public class CASO10 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner(System.in);
		
		String continuar = "S", nombre_mayor = "Millonarios", nombre_menor = "Pobres", empleado_tardanza= "";
		float sueldo = 0, bonificacion = 0, sueldo_neto= 0, porcentaje = 0, descuento = 0;
		
		float sueldo_mayor = 0, sueldo_menor = 9999999999999f;
		int c = 0, empleado_porcentaje = 0, mayor_tardanza = 0;
		
		while (continuar.contentEquals("S")|| continuar.contentEquals("S")) {
			c++;
			
			System.out.println("**************");
			System.out.println("REGISTRO DE EMPLEADOS ("+c+")");
			System.out.println("****************************");
			System.out.println("EMPLEADO: "); String nombre = Mark.nextLine();
			System.out.println("HORAS TRABAJADAS:  "); int horas = Mark.nextInt();
			System.out.println("TARIFA POR HORA: "); float tarifa= Mark.nextFloat();
			System.out.println("MINUTOS DE TARDANZA: "); int minutos = Mark.nextInt();
			
			sueldo = horas * tarifa;
			if (horas <= 50) {
				bonificacion=0;
			}
			if (horas>50 & horas<=60) {
				bonificacion= (sueldo*0.02f);
			}
			if (horas>60 & horas <=70) {
				bonificacion =(sueldo*0.08f);
			}
			if (horas>70 & horas <=80) {
				bonificacion = (sueldo*0.13f);
			}
			if (horas>80) {
				bonificacion=(sueldo*0.15f);
			}
			if (minutos<=15) {
				descuento=0;
			}
			if (minutos>=15 & minutos <= 30) {
				descuento= (sueldo*003f)*minutos;
			}
			if (minutos >30) {
				descuento= (sueldo*0.05f)*minutos;
			}
			
			sueldo_neto = sueldo + bonificacion + descuento;
			
			porcentaje=(horas*100/80);
			
			System.out.println("****************************");
			System.out.println("*********RESULTADOS*********");
			System.out.println("SUELDO BRUTO: S/" + sueldo);
			System.out.println("BONIFICACION: S/" + bonificacion);
			System.out.println("DESCUENTO: S/" + descuento);
			System.out.println("SUELDO NETO:  S/" + sueldo_neto);
			System.out.println("% ALCANZADO:  " + porcentaje + "%");
			
			System.out.println("=================================");
			System.out.println("¿NUEVO EMPLEADO? [S/N]:  ");
			Mark.nextLine();
			continuar= Mark.nextLine();
			System.out.println("=================================");
			
			if (sueldo_neto>sueldo_mayor) {
				sueldo_mayor = sueldo_neto;
				nombre_mayor= nombre;
			}
			if (sueldo_neto<sueldo_menor) {
				sueldo_menor=sueldo_neto;
				nombre_menor = nombre;
			}
			if (minutos>mayor_tardanza) {
				mayor_tardanza=minutos;
				empleado_tardanza=nombre;
			}
			if (porcentaje>90) {
				empleado_porcentaje = empleado_porcentaje+1;
			}
		}
		System.out.println("*****************************");
		System.out.println("*********RESULTADOS*********");
		System.out.println("*****************************");
		
		System.out.println("NUMERO DE EMPLEADO : " + c);
		System.out.println("SUELDO NETO MAYOR : S/" + sueldo_mayor+ ", pertenece a:  " + nombre_mayor);
		System.out.println("SUELDO NETO MENOR : S/ "+ sueldo_menor+ ", pertenece a:  " + nombre_menor);
		System.out.println("EMPLEADO CON LA MAYOR CANTIDADDE MINUTOS DE TARDANZA: " + empleado_tardanza + "(" + mayor_tardanza+"min)");
		System.out.println("CANTIDAD DE EMPLEADOS CON MAS DEL 90% DE LA NETA : " +empleado_porcentaje);
		
		}	

	}


