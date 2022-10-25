package armas;

public class Arco extends Arma {
    private int daño = 30;
    private int municion = 10;

    @Override
    public int usarArma() {
        if (municion > 0){
            municion -= 1;
            if (Math.random() * 10 > 3) {
                return daño;
            } else {
                System.out.println("¡Ha fallado!");
                return 0;
            }
        } else {
            System.out.println("¡No me queda munición!");
            return 0;
        }
    }
}
