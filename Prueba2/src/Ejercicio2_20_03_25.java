import java.util.Scanner;

public class Ejercicio2_20_03_25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int n = 0;
		n = entrada.nextInt();
		int nDigitos = 1;
		
		int m = n;
		m /= 10;
		
		while ((m % 10) != 0) {
			nDigitos++;
			m /= 10;
		}
		
		System.out.println("El número " + n + " tiene "+ nDigitos + " dígitos");
		
		entrada.close();
	}

}
