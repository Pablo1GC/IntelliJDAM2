package hilos;

import calculo.CalculoPrimos;
import java.math.BigInteger;

public class Hilo extends Thread {
    private BigInteger num;

    public Hilo(BigInteger num) {
        this.num = num;
    }

    public void run() {
        long inicio = System.currentTimeMillis();

        System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
        System.out.println();
        CalculoPrimos calculoPrimos = new CalculoPrimos();
        calculoPrimos.calcularPrimos(num);
        long fin = System.currentTimeMillis();

        double tiempo = (double) ((fin - inicio) / 1000);

        System.out.println("El hilo " + Thread.currentThread().getName() + " ha tardado " + tiempo + " segundos en ejecutarse.");
        System.out.println();


    }
}
