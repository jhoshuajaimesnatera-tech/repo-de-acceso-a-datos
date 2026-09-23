package Ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Puedes cambiar esta ruta para probar con un fichero existente o una ruta inexistente (ej. "ruta_falsa.txt")
		Path ruta = Paths.get("centro/2026/exportaciones/fichero.txt");

		System.out.println("Ruta evaluada " + ruta.toAbsolutePath());

		// Comprobamos si la ruta existe para evitar que el programa falle
		if (Files.exists(ruta)) {
			System.out.println("Estado: El fichero o directorio SÍ existe.");
			System.out.println("Es directorio: " + Files.isDirectory(ruta));
			System.out.println("Es fichero regular: " + Files.isRegularFile(ruta));

			try {
				// Leemos los atributos básicos para obtener tamaño y fecha de modificación
				BasicFileAttributes attrs = Files.readAttributes(ruta, BasicFileAttributes.class);
				System.out.println("Tamaño: " + attrs.size() + " bytes[cite: 2]");
				System.out.println("Fecha de última modificación: " + attrs.lastModifiedTime() + "[cite: 2]");
			} catch (IOException e) {
				System.out.println("No se pudieron leer los atributos del archivo.");
			}
		} else {
			// Controlamos el caso de ruta inexistente para que el programa no se caiga[cite: 2]
			System.out.println("Estado: El fichero o directorio NO existe[cite: 2].");
		}
	}
}
