package personajes;

import armas.*;
import atributos.Atributo;

public class Curandero extends Personaje {

    Atributo atributo = Atributo.SABIDURIA;

    public Curandero(Arma arma, String nombre, int vida) {
        super(arma, nombre, vida);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0) {
            if (getArma() instanceof Rezo) {
                restar *= 2;
            }
            if (enemigo.getAtributo() == Atributo.FUERZA) {
                restar += 10;
            }
            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");

        }
        enemigo.setVida(enemigo.getVida() - restar);

    }
}
