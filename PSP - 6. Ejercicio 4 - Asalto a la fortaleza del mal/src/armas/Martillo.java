package armas;

public class Martillo extends Arma{
    private int daño = 40;

    @Override
    public int usarArma() {
        if (Math.random() * 10 > 1) {
            return daño;
        } else {
            System.out.println("¡Ha fallado!");
            return 0;
        }
    }
}
