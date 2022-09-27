package clases;

public class Ram {
    private double herzios;
    private int capacidad;
    private String tipo;
    private double precio;

    public double getHerzios() {
        return herzios;
    }

    public void setHerzios(double herzios) {
        this.herzios = herzios;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "herzios=" + herzios +
                ", capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
