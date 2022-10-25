package personajes;

import armas.Arco;
import armas.Arma;
import armas.Espada;
import atributos.Atributo;

public class Guerrero extends Personaje {

    Atributo atributo = Atributo.FUERZA;

    public Guerrero(Arma arma, String nombre, int vida) {
        super(arma, nombre, vida);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0){
            if (getArma() instanceof Espada || getArma() instanceof Arco) {
                restar *= 2;
            }
            if (enemigo.getAtributo() == Atributo.INTELIGENCIA) {
                restar += 10;
            }
            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");
        }

        enemigo.setVida(enemigo.getVida() - restar);
    }
}
