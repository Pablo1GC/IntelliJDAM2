package clases;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private String marca;
    private double precio;

    private List<Procesador> listaProcesador;
    private List<Periferico> listaPerifericos;
    private List<Ram> listaRam;

    private TarjetaGrafica tarjetaGrafica;

    public double precioTotal(){
        double precioProcesador = 0;
        for (Procesador procesador : listaProcesador){
            precioProcesador += procesador.getPrecio();
        }
        double precioPerifericos = 0;
        for (Periferico periferico : listaPerifericos){
            precioPerifericos += periferico.getPrecio();
        }
        double precioRam = 0;
        for (Ram ram : listaRam){
            precioRam += ram.getPrecio();
        }


        return precioProcesador + precioRam + precioPerifericos + tarjetaGrafica.getPrecio() + precio;
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

    public List<Procesador> getListaProcesador() {
        return listaProcesador;
    }

    public void setListaProcesador(List<Procesador> listaProcesador) {
        this.listaProcesador = listaProcesador;
    }

    public List<Periferico> getListaPerifericos() {
        return listaPerifericos;
    }

    public void setListaPerifericos(List<Periferico> listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    public List<Ram> getListaRam() {
        return listaRam;
    }

    public void setListaRam(List<Ram> listaRam) {
        this.listaRam = listaRam;
    }

    public TarjetaGrafica getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", listaProcesador=" + listaProcesador +
                ", listaPerifericos=" + listaPerifericos +
                ", listaRam=" + listaRam +
                ", tarjetaGrafica=" + tarjetaGrafica +
                '}';
    }
}
