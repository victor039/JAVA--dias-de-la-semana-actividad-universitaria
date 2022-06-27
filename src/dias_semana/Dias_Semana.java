//Elabore un programa que lea un número entre 1 y 7, luego lo trasforme al día de la semana correspondiente,
// entiéndase que el día 1 es el lunes.
package dias_semana;

import java.util.Scanner;

public class Dias_Semana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		int numero;
		System.out.println("Ingrese un número entre 1 y 7  ");
		numero = teclado.nextInt();
		
		switch(numero) {
			case 1:System.out.print("El numero 1 corresponde al día Lunes");
			break;
			case 2:System.out.print("El numero 2 corresponde al día Martes");
			break;
			case 3:System.out.print(" El numero 3 corresponde al día Miercoles");
			break;
			case 4:System.out.print("El numero 4 corresponde al día Jueves ");
			break;
			case 5:System.out.print("El numero 5 corresponde al día Viernes");
			break;
			case 6:System.out.print("El numero 6 corresponde al día Sábado");
			break;
			case 7:System.out.print("El numero 7 corresponde al día  Domingo");
			default: System.out.print("Numero equivocado");			
		}	 		
	}
}
