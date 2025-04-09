import java.util.Scanner;
public class Ejercicio3_20_03_25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 1, m = 0;
		String resultado = "";
		
		while(n > 0) {
			System.out.println("Introduce un número(escribe 0 o menor para terminar): ");
			n = entrada.nextInt();
			
			
			if(n != 0 || n > 0) {
				resultado += n;
				m += n;
				resultado += " + ";				
			} else {
				resultado += n;
				break;
			}
			
		}
		System.out.println(resultado + " = " + m);
		
		entrada.close();
	}

}
