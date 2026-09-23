package Ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio2 {
    public static void main(String[] args) {
        Path ruta = Paths.get("centro", "2026", "exportaciones");
        try {
            // Crea toda la estructura de directorios de una sola vez
            Files.createDirectories(ruta);
            
            // Escribe un fichero de texto dentro de esa estructura
            Path fichero = ruta.resolve("fichero.txt");
            Files.writeString(fichero, "Contenido de prueba");
            
            System.out.println("Estructura y fichero creados correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}