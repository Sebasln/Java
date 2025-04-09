package Sesion2;

import java.util.Iterator;

public class Sesion2 {

	public static void main(String[] args) {
		String fragmentoNombreAlumnos = "Victor";
		String[] nombreAlumnos = {"Antonio", "Marta", "Victor Hugo", "David"};
		
		int resultado = contarUsuarios(fragmentoNombreAlumnos, nombreAlumnos);
		System.out.println("Total resultados: " + resultado);

	}
	private static int contarUsuarios(String fragmentoNombreAlumno, String[] nombreAlumnos) {
		int totalEncontrados = 0;
		
		for (String nombreAlumnoActual : nombreAlumnos) {
			if(nombreAlumnoActual.contains(fragmentoNombreAlumno)) {
				totalEncontrados++;
			}
		}
		return totalEncontrados;
	}
}
/*
	static int contarUsuarios(String fragmentoNombreAlumno, String[] nombreAlumnos) {
		boolean encontrado = false;
		int totalEncontrados = 0;
		
		for (String nombreAlumnoActual1 : nombreAlumnos) {
			if(nombreAlumnoActual.contains(fragmentoNombreAlumno)) {
				encontrado = true;
			}
			if(encontrado) {
				totalEncontrados++;
			}
		}
		return totalEncontrados;
	}
}
*/
	
