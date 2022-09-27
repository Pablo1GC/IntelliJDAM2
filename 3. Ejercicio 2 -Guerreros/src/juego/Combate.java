package juego;

import personajes.Personaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combate {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void combate(Personaje p1, Personaje p2) throws IOException {
        do {
            System.out.println(p1.getNombre() + ": Es tu turno. (Presiona enter para atacar)");
            in.readLine();
            p1.atacar(p2);
            p2.mostrarVida();
            if (p2.getVida() >= 0) {
                System.out.println(p2.getNombre() + ": Es tu turno. (Presiona enter para atacar)");
                in.readLine();
                p2.atacar(p1);
                p1.mostrarVida();
            }
        } while (p1.getVida() > 0 && p2.getVida() > 0);
        if (p1.getVida() > 0) {
            System.out.println("¡El combate ha terminado " + p1.getNombre() + " es el ganador!");
        } else if (p2.getVida() > 0) {
            System.out.println("¡El combate ha terminado " + p2.getNombre() + " es el ganador!");
        } else {
            System.out.println("¡El combate ha acabado en empate!");
        }
    }
}
