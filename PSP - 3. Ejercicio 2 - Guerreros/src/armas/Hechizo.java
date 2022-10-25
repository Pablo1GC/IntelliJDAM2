package armas;

public class Hechizo extends Arma{
    private int daño = 15;

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
