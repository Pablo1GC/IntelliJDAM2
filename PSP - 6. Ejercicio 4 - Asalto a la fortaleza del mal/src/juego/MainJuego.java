package juego;

import armas.Espada;
import armas.Hechizo;
import armas.Martillo;
import armas.Rezo;
import personajes.*;

import java.io.IOException;

public class MainJuego {

    public static void main(String[] args) throws IOException {
        System.out.println("¡Bienvenido jugador!");

        Enemigo enemigo  = new Enemigo(new Martillo(), "Sauron", 60);
        Combate combate = new Combate(enemigo);

        Curandero curandero = new Curandero(new Hechizo(), "Luis", 120, combate);
        Mago mago = new Mago(new Rezo(), "Pepe", 100, combate);
        Guerrero guerrero = new Guerrero(new Espada(), "Rigoberto", 150, combate);

        curandero.start();
        mago.start();
        guerrero.start();

    }
}
