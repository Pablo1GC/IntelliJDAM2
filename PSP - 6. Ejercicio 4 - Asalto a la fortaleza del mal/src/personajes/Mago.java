package personajes;

import armas.Arma;
import armas.Hechizo;
import atributos.Atributo;
import juego.Combate;

import java.io.IOException;

public class Mago extends Personaje {

    Atributo atributo = Atributo.INTELIGENCIA;

    public Mago(Arma arma, String nombre, int vida, Combate combate) {
        super(arma, nombre, vida, combate);
    }

    @Override
    public void atacar(Enemigo enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0) {
            if (getArma() instanceof Hechizo) {
                restar *= 2;
            }

            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");
        }
        enemigo.setVida(enemigo.getVida() - restar);
    }

}
