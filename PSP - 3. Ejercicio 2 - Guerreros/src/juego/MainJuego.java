package juego;
import personajes.Personaje;
import java.io.IOException;

public class MainJuego {

    public static void main(String[] args) throws IOException {
        System.out.println("¡Bienvenido jugador!");

        SeleccionPersonajes seleccionPersonajes = new SeleccionPersonajes();

        Personaje personaje1 = seleccionPersonajes.seleccionPersonaje1();
        Personaje personaje2 = seleccionPersonajes.seleccionPersonaje2();

        Combate combate = new Combate();
        combate.combate(personaje1, personaje2);
    }
}
