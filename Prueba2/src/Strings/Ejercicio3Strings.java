package Strings;
import java.util.Scanner;

public class Ejercicio3Strings {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		
		int cantidadPalabras = contarPalabras(texto);
		
		System.out.println("EL texto tiene " + cantidadPalabras + " palabras");
		
		
		
		entrada.close();
	}

	
	private static int contarPalabras(String texto) {
		
		int cantidad = 0;
		
		for(int i = 0; i < texto.length(); i++) {						
			if(texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') {
				
				cantidad++;
			}
		}
		
		return cantidad;
	}
}
