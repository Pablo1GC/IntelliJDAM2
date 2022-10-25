package personajes;

import armas.Arco;
import armas.Arma;
import armas.Espada;
import atributos.Atributo;
import juego.Combate;

import java.io.IOException;

public class Guerrero extends Personaje {

    Atributo atributo = Atributo.FUERZA;

    public Guerrero(Arma arma, String nombre, int vida, Combate combate) {
        super(arma, nombre, vida, combate);
    }

    @Override
    public void atacar(Enemigo enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0){
            if (getArma() instanceof Espada || getArma() instanceof Arco) {
                restar *= 2;
            }

            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");
        }

        enemigo.setVida(enemigo.getVida() - restar);
    }

}
