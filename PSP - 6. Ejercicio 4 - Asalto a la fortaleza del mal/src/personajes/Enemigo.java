package personajes;

import armas.Arma;
import armas.Martillo;
import atributos.Atributo;

public class Enemigo {
    private Arma arma;
    private String nombre;
    private int vida;

    public Enemigo(Arma arma, String nombre, int vida) {
        this.arma = arma;
        this.nombre = nombre;
        this.vida = vida;
    }
    public void atacar(Personaje enemigo) {
        int restar = getArma().usarArma();
        if (restar > 0) {
            if (getArma() instanceof Martillo) {
                restar *= 2;
            }
            if (enemigo.getAtributo() == Atributo.INTELIGENCIA) {
                restar += 10;
            }
            System.out.println("¡El enemigo ha usado " + getArma().getClass().getSimpleName() + " causando " + restar + " de daño!");
        }

        enemigo.setVida(enemigo.getVida() - restar);
    }

    public void mostrarVida(){
        int aux = 0;
        System.out.println();
        System.out.println("<--    Vida de:  " + nombre + "    -->");
        System.out.print("[");
        for (int i = 0; i<= 120; i++){
            if (i == vida){
                System.out.print(vida);
            }
            System.out.print("*");
        }
        System.out.println("]");
        System.out.println();
    };

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

}
