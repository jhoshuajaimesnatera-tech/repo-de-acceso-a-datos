package Ejercicios;

import java.io.File;

public class Ejercicio1 {
	public static void main(String[] args) {
        // Directorio de trabajo actual (Current Working Directory)
        String directorioTrabajo = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo: " + directorioTrabajo);

        // Fichero con ruta relativa
        File ficheroRelativo = new File("archivo.txt");
        System.out.println("Ruta absoluta del fichero relativo: " + ficheroRelativo.getAbsolutePath());
    }
}

