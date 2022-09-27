package clases;

public class Procesador {
    private String modelo;
    private int numeroNucleos;
    private double numeroHerzios;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public double getNumeroHerzios() {
        return numeroHerzios;
    }

    public void setNumeroHerzios(double numeroHerzios) {
        this.numeroHerzios = numeroHerzios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "modelo='" + modelo + '\'' +
                ", numeroNucleos=" + numeroNucleos +
                ", numeroHerzios=" + numeroHerzios +
                ", precio=" + precio +
                '}';
    }
}
