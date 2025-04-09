import java.util.Scanner;

public class Ejercicio1_20_03_25 {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		contarN(entrada);
		
		entrada.close();
	}
	
	public static void contarN(Scanner entrada) {
		System.out.println("Indica cuántos números quieres introducir: ");
		
		int n = entrada.nextInt();
		
		int mayor = 0;
		
		int menor = 0;
		
		
		int aux = 0;
		
		int[] numeros = new int[n];
		
		System.out.println("Introduce el número 1:");	
		numeros[0] = entrada.nextInt();
		
		mayor = numeros[0];
		menor = numeros[0];
		
		for(int i = 1; i < n; i++) {
			
			 System.out.println("Introduce el número " + (i + 1) + ":");
	            numeros[i] = entrada.nextInt();

	            if (numeros[i] > mayor) {
	                mayor = numeros[i];
	            }
	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
		}
		
		contarMayorMenor(numeros, n, mayor, menor);
	}
	
	private static void contarMayorMenor(int numeros[], int n, int mayor, int menor) {
		int contadorMayor = 0;
		int contadorMenor = 0;
			
		for(int i = 0; i < n; i++) {
			if(numeros[i] == mayor) {
				contadorMayor++;
			}
			
			if(numeros[i] == menor) {
				contadorMenor++;
			}
		}
		
		System.out.println("El mayor es " + mayor + "("+ contadorMayor + " veces) " + "y el menor es " + menor+ "("+ contadorMenor+ " veces).");
		
	}
}
