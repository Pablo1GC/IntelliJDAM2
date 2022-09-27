package clases;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador();
        Periferico raton1 = new Periferico();
        Periferico teclado1 = new Periferico();
        Periferico monitor1 = new Periferico();
        Procesador procesador1 = new Procesador();
        Ram ram1 = new Ram();
        Ram ram2 = new Ram();
        Ram ramGrafica = new Ram();
        TarjetaGrafica tarjetaGrafica1 = new TarjetaGrafica();


        List<Periferico> listaPerifericos = new ArrayList<>();
        listaPerifericos.add(raton1);
        listaPerifericos.add(teclado1);
        listaPerifericos.add(monitor1);

        List<Ram> listaRam = new ArrayList<>();
        listaRam.add(ram1);
        listaRam.add(ram2);

        List<Procesador> listaProcesador = new ArrayList<>();
        listaProcesador.add(procesador1);


        ordenador1.setMarca("HP");
        ordenador1.setPrecio(450.80);

        raton1.setMarca("Razer");
        raton1.setPrecio(50.60);
        raton1.setTipo("Raton");
        teclado1.setMarca("Ducky");
        teclado1.setPrecio(120.40);
        teclado1.setTipo("Teclado");
        monitor1.setMarca("Samsung");
        monitor1.setPrecio(450.10);
        monitor1.setTipo("Monitor");

        procesador1.setModelo("Intel");
        procesador1.setPrecio(340.14);
        procesador1.setNumeroHerzios(430.10);
        procesador1.setNumeroNucleos(8);

        ram1.setCapacidad(8);
        ram1.setPrecio(60.50);
        ram1.setTipo("DDR5");
        ram1.setHerzios(1200);
        ram2.setCapacidad(8);
        ram2.setPrecio(60.50);
        ram2.setTipo("DDR5");
        ram2.setHerzios(200);
        ramGrafica.setCapacidad(4);
        ramGrafica.setPrecio(0);
        ramGrafica.setTipo("DDR5");
        ramGrafica.setHerzios(800);


        tarjetaGrafica1.setHerzios(400);
        tarjetaGrafica1.setPrecio(560.21);
        tarjetaGrafica1.setTipo("3060");
        tarjetaGrafica1.setMarca("Nvidia");
        tarjetaGrafica1.setRam(ramGrafica);

        ordenador1.setTarjetaGrafica(tarjetaGrafica1);
        ordenador1.setListaPerifericos(listaPerifericos);
        ordenador1.setListaRam(listaRam);
        ordenador1.setListaProcesador(listaProcesador);

        System.out.println(ordenador1.precioTotal());




    }
}
