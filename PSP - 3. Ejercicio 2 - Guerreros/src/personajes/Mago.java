package personajes;

import armas.Arma;
import armas.Hechizo;
import atributos.Atributo;

public class Mago extends Personaje {

    Atributo atributo = Atributo.INTELIGENCIA;

    public Mago(Arma arma, String nombre, int vida) {
        super(arma, nombre, vida);
    }

    @Override
    public void atacar(Personaje enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0){
            if (getArma() instanceof Hechizo) {
                restar *= 2;
            }
            if (enemigo.getAtributo() == Atributo.SABIDURIA) {
                restar += 10;
            }
            System.out.println("¡Has usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");
        }
        enemigo.setVida(enemigo.getVida() - restar);
    }
}
