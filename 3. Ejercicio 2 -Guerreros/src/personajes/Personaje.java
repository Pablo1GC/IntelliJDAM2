package personajes;

import armas.Arma;
import atributos.Atributo;

public abstract class Personaje {
    private Arma arma;
    private String nombre;
    private int vida;
    private Atributo atributo;

    public Personaje(Arma arma, String nombre, int vida) {
        this.arma = arma;
        this.nombre = nombre;
        this.vida = vida;
    }

    public abstract void atacar(Personaje enemigo);

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }
}
