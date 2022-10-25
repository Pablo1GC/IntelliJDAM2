package armas;

public class Espada extends Arma {
    private int daño = 20;

    @Override
    public int usarArma() {
        if (Math.random() * 10 > 2) {
            return daño;
        } else {
            System.out.println("¡Ha fallado!");
            return 0;
        }
    }
}
