package personajes;

import armas.Arma;
import armas.Rezo;
import atributos.Atributo;
import juego.Combate;

import java.io.IOException;

public class Curandero extends Personaje {

    Atributo atributo = Atributo.SABIDURIA;

    public Curandero(Arma arma, String nombre, int vida, Combate combate) {
        super(arma, nombre, vida, combate);
    }

    @Override
    public void atacar(Enemigo enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0) {
            if (getArma() instanceof Rezo) {
                restar *= 2;
            }

            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");

        }
        enemigo.setVida(enemigo.getVida() - restar);
    }

}
