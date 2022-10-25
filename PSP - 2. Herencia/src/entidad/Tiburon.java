package entidad;

public class Tiburon extends Pez {
    @Override
    public void comer(Object o) {
        if (o instanceof Pez) {
            System.out.println("Soy el tiburón " + this.getNombre()
                    + " y me voy a comer al pez " + ((Pez) o).getNombre());
            double aumentoPeso = ((Pez) o).getPeso() / 10;
            setPeso(getPeso() + aumentoPeso);
        } else {
            System.out.println("Los tiburones sólo comemos peces");
        }
    }
}
