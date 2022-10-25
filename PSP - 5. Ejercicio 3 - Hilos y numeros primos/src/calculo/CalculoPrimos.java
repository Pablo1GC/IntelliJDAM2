package calculo;

import java.math.BigInteger;

public class CalculoPrimos {
    public void calcularPrimos(BigInteger num) {
        int contador = 2;
        BigInteger auxContador = BigInteger.valueOf(contador);
        BigInteger a = new BigInteger("0");
        boolean primo = true;
        if (num.intValue() == 1) {
            primo = false;
        }
        while ((primo) && (auxContador.intValue() != num.intValue())) {
            BigInteger calculo = num.remainder(auxContador);
            if (calculo.intValue() == a.intValue()) {
                primo = false;
            }
            contador++;
            auxContador = BigInteger.valueOf(contador);
        }
        if (primo) System.out.println("El número " + num + " es primo");
        else System.out.println("El número " + num + " no es primo");
        System.out.println();
    }
}

