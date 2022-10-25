package armas;

public class Rezo extends Arma{
    private int daño = 20;

    @Override
    public int usarArma() {
        if (Math.random() * 10 > 3) {
            return daño;
        } else {
            System.out.println("¡Ha fallado!");
            return 0;
        }
    }
}
