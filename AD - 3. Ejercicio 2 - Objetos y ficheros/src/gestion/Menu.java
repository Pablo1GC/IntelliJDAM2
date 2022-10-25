package gestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    int opcion = 0;

    public int mostrarMenu() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Elija una opción:");
            System.out.println("[1] Introducir videojuego.");
            System.out.println("[2] Obtener videojuego por ID.");
            System.out.println("[3] Borrar videojuego por ID.");
            System.out.println("[4] Listar todos los videojuegos.");
            System.out.println("[5] Salir.");

            try {
                opcion = Integer.parseInt(in.readLine());
            } catch (Exception e) {
                System.out.println("Seleccione una opción válida.");
                System.out.println();
            }
        } while (opcion < 0 || opcion > 6);

        return opcion;
    }

    public void gestionarOpcion() throws IOException {
        InteraccionFicheros interaccionFicheros = new InteraccionFicheros();
        while (opcion != 5) {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    interaccionFicheros.introducirVideojuego();
                    break;
                case 2:
                    interaccionFicheros.leerVideojuego();
                    break;
                case 3:
                    interaccionFicheros.eliminarVideojuego();
                    break;
                case 4:
                    interaccionFicheros.mostrarVideojuegos();
                    break;
            }
        }
        System.out.println("¡Hasta luego!");
    }
}

