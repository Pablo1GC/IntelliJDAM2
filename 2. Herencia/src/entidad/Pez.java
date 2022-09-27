package entidad;

public abstract class Pez extends Animal {
    private int numeroAletas;

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    @Override
    public void comer(Object o) {
        if (o instanceof Placton) {
            System.out.println("Soy el pez " + this.getNombre() +
                    " de tipo " + this.getClass().getSimpleName() + " y voy a comer placton");
            double aumentoPeso = ((Placton) o).getCaloria() / 1000;
            this.setPeso(getPeso() + aumentoPeso);
        } else {
            System.out.println("Soy un pez y sólo como placton");
        }
    }
}
