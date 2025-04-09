package Strings;
import java.util.Scanner;

public class Ejercicio4Strings {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una palabra a comprobar");
		
		String palabra = entrada.nextLine();
		
		if(isPalin(palabra)) {
			System.out.println(palabra + " es palíndroma");
		} else {
			System.out.println(palabra + " no es palíndroma");
		}
		
		entrada.close();
	}

	private static boolean isPalin(String palabra) {
		for(int i = 0; i < (palabra.length() / 2); i++) {						
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}
