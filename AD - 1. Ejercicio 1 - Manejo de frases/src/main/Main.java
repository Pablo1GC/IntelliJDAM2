package main;

import frases.GestionFichero;
import frases.Menu;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int opcion = 0;

        Menu menu = new Menu();
        GestionFichero gestionFichero = new GestionFichero();

        do {
            opcion = menu.seleccionarMenu();
            gestionFichero.gestionarOpcion(opcion);
        } while (opcion != 4);
    }
}
