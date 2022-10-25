package calculo;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class CapturaNumeros {
    BigInteger[] n = new BigInteger[3];

    public BigInteger[] recogerValores() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca tres números:");

        n[0] = scan.nextBigInteger();
        n[1] = scan.nextBigInteger();
        n[2] = scan.nextBigInteger();

        return n;
    }


}
