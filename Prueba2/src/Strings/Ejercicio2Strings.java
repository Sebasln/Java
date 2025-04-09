package Strings;
import java.util.Scanner;

public class Ejercicio2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						String[] arr = new String[5];
				System.out.println("Introduce cinco palabras: ");
				
				Scanner entrada = new Scanner(System.in);
				
				for (int i = 0; i < 5; i++) {
					System.out.println("\tIntroduce la palabra " + (i + 1));
					
					arr[i] = entrada.nextLine();
				}
				
				
				
				entrada.close();
	}
}
