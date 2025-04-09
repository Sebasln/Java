import java.util.Scanner;

public class Ejercicio4_20_03_25{

	public static void main(String[] args) {

		int numero = 0;

		int digitos = 0;

		int resultado = 0;

		int total = 0;

		int temp = 0;

		String frase = "";

		Scanner entrada = new Scanner(System.in);

		

		

		System.out.println("Introduce un número mayor o igual a 0:");

		numero = entrada.nextInt();

		

		while(numero > 0) {

			digitos = 0;

			resultado = 0;

			temp = numero;

			while (temp > 0){

				resultado += temp % 10;

				digitos += 1;

				temp /= 10;

			}

			if (resultado == digitos) {

				frase += numero + " + ";

				total += numero ;

			}

			System.out.println("Introduce otro número:");

			numero = entrada.nextInt();

		}

		frase += numero + " = ";

		System.out.println("El resultado es: " + frase + total);

		

		entrada.close();

	}

}