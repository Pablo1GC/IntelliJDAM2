package frases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int opcion = 0;

    public int seleccionarMenu() throws IOException {
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("[1] Introducir frases célebres.");
            System.out.println("[2] Mostrar frases célebres.");
            System.out.println("[3] Mostrar frase célebre aleatoria.");
            System.out.println("[4] Salir. ");
            System.out.println();
            try {
                opcion = Integer.parseInt(in.readLine());
            } catch (Exception e) {
                System.out.println("Seleccione una opción válida.");
                System.out.println();
            }
        } while (opcion < 0 || opcion > 4);
        return opcion;
    }
}
