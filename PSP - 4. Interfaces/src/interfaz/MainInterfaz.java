package interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class MainInterfaz {
    public static void main(String[] args) {
        Movible m = new Caballo();
        Movible m2 = new Persona();

        List<Movible> listaMovible = new ArrayList<Movible>();

        Persona p = (Persona) m2;
        p.setNombre("Gilito");
        p.setVelocidadMax(10);

        listaMovible.add(m);
        listaMovible.add(m2);

        for (Movible m3 : listaMovible) {
            m3.moverseLento();
            int posicion = m3.moverse(20);
            System.out.println("El objeto " + m3.getClass().getCanonicalName() + " está en la posición " + posicion);
        }

        Operacion op = new Operacion() {
            @Override
            public int operar(int n1, int n2) {
                return n1 + n2;
            }
        };
        System.out.println(op.operar(3, 4));
        System.out.println(op.operar(6, 7));

        op = new Operacion() {
            @Override
            public int operar(int n1, int n2) {
                return n2 - n1;
            }
        };

        System.out.println(op.operar(3, 4));
        System.out.println(op.operar(6, 7));

        // Java decidió implementar las funciones lambda a partir
        // de las version 1.8 y su objetivo era simplificar las
        // clases anónimas creadas a partir de una interfaz.
        // Así pues, podemos usar funciones lambda en vez de clases
        // anónimas, siempre y cuando la interfaz sea una interfaz
        // funciona, Una int funcional es una interfaz con un único
        // método abstracto.

        // Una interfaz lambda lo que busca es emular la programación
        // funcional que no tenía Java antes de la v 1.8. La única
        // manera que tenía Java de emular la programación funcional
        // era mediante interfaces funcionales.

        // Una función lambda tiene la siguiente estructura:
        // (parametroEntrada) -> { CODIGO }

        Operacion opLambda = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println(opLambda.operar(3, 4));
        System.out.println(opLambda.operar(6, 7));

        opLambda = (n1, n2) -> {
            return n2 - n1;
        };
        System.out.println(opLambda.operar(3, 4));
        System.out.println(opLambda.operar(6, 7));

        opLambda = (n1, n2) -> {
            return n2 / n1;
        };
        System.out.println(opLambda.operar(2, 4));
        System.out.println(opLambda.operar(5, 3));

        OperacionGenerica<Double> opDouble = (n1, n2) -> n2 / n1;
        OperacionGenerica<Integer> opInteger = (n1, n2) -> n2 / n1;

        System.out.println(opDouble.operar(2.0, 4.0));
        System.out.println(opDouble.operar(5.0, 3.0));

        System.out.println(opInteger.operar(2, 4));
        System.out.println(opInteger.operar(5, 3));

        Almacen<Operacion, Movible> almacenOp = new Almacen<>();
        almacenOp.setObjeto1(opLambda);
        almacenOp.setObjeto2(m2);

        Consumer<Movible> c = new Consumer<Movible>() {
            @Override
            public void accept(Movible t) {
                System.out.println(t);
            }
        };

        listaMovible.forEach(v -> System.out.println(v));
        listaMovible.forEach(c);

        Function<Double, Double> operCuadrado =
                (n1) -> n1 * n1;

        // BiFunctio es igual que operación genérica
        BiFunction<Double, Double, Double> operDividir =
                (n1, n2) -> n2 / n1;

    }
}

