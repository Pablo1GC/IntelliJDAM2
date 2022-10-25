package main;

import calculo.CapturaNumeros;
import hilos.Hilo;

import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BigInteger[] n = new BigInteger[3];

        CapturaNumeros capturaNumeros = new CapturaNumeros();
        n = capturaNumeros.recogerValores();

        Hilo hilo1 = new Hilo(n[0]);
        hilo1.setName("Hilo1");
        Hilo hilo2 = new Hilo(n[1]);
        hilo2.setName("Hilo2");
        Hilo hilo3 = new Hilo(n[2]);
        hilo3.setName("Hilo3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println("Hilo principal parando");
        System.out.println();
    }


}
