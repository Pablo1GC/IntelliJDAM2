package juego;

import personajes.Enemigo;
import personajes.Personaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combate {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private Enemigo p2;

    public Combate(Enemigo enemigo) {
        this.p2 = enemigo;
    }

    public synchronized void combate(Personaje p1) throws IOException {
        if (p2.getVida() <= 0) {
            System.out.println("El luchador " + p1.getNombre() + " ha entrado en la cueva de " + p2.getNombre()
                    + " pero ya estaba muerto.");
            System.out.println();
        }
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println(p1.getNombre() + ": Es tu turno. (Presiona enter para atacar)");
            in.readLine();
            p1.atacar(p2);
            p2.mostrarVida();
            if (p2.getVida() >= 0) {
                System.out.println(p2.getNombre() + ": Es el turno del enemigo. (Presiona enter para atacar)");
                in.readLine();
                p2.atacar(p1);
                p1.mostrarVida();
            }
            if (p1.getVida() > 0 && p2.getVida() <= 0) {
                System.out.println("¡El combate ha terminado " + p1.getNombre() + " ha derrotado al enemigo!");
                System.out.println();
                System.out.println("Público: ¡Bravo " + p1.getNombre() + ", eres el mejor!");
                System.out.println();
            } else if (p2.getVida() > 0 && p1.getVida() <= 0) {
                System.out.println("¡El combate ha terminado " + p2.getNombre() + " te ha matado!");
                System.out.println();
            } else if (p1.getVida() <= 0 && p2.getVida() <= 0) {
                System.out.println("¡El combate ha acabado en empate!");
                System.out.println();
            }
        }

    }
}
