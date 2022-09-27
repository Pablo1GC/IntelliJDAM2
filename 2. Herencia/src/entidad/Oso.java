package entidad;

public class Oso extends Animal{
    @Override
    public void comer(Object o) {
        if (o instanceof Animal) {
            System.out.println("Soy el oso " + this.getNombre()
                    + " y me voy a comer al animal " + ((Animal) o).getNombre());
            double aumentoPeso = ((Animal) o).getPeso() / 10;
            setPeso(getPeso() + aumentoPeso);
        } else {
            System.out.println("Los osos sólo comemos animales");
        }
    }
}
