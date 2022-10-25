package personajes;

import armas.Arma;
import atributos.Atributo;
import juego.Combate;

import java.io.IOException;

public abstract class Personaje extends Thread{
    private Arma arma;
    private String nombre;
    private int vida;
    private Atributo atributo;
    private Combate combate;

    public Personaje(Arma arma, String nombre, int vida, Combate combate) {
        this.arma = arma;
        this.nombre = nombre;
        this.vida = vida;
        this.combate = combate;
    }

    public void run() {
        try {
            this.combate.combate(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void atacar(Enemigo enemigo);

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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Atributo getAtributo() {
        return atributo;
    }

}
