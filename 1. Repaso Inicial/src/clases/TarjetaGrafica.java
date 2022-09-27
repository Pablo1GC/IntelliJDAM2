package clases;

public class TarjetaGrafica {
    private  String tipo;
    private Ram ram;
    private double herzios;
    private String marca;
    private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public double getHerzios() {
        return herzios;
    }

    public void setHerzios(double herzios) {
        this.herzios = herzios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "tipo='" + tipo + '\'' +
                ", ram=" + ram +
                ", herzios=" + herzios +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
