package main;

import entidad.*;

import java.util.ArrayList;
import java.util.List;

public class MainHerencia {
    public static void main(String[] args) {
        Animal a = null;
        a = new Trucha();
        a.setNombre("Trucharda");
        a.setPeso(20);
        a.setSexo(Sexo.HEMBRA);
        Trucha t = (Trucha) a;
        t.setNumeroAletas(4);

        Tiburon tiburon = new Tiburon();
        tiburon.setNombre("Arenita");
        tiburon.setNumeroAletas(6);
        tiburon.setPeso(400);
        tiburon.setSexo(Sexo.HERMAFRODITA);

        Oso oso = new Oso();
        oso.setNombre("Yogi");
        oso.setPeso(350);
        oso.setSexo(Sexo.MACHO);

        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(t);
        listaAnimales.add(tiburon);
        listaAnimales.add(oso);

        Placton placton = new Placton();
        placton.setCaloria(1000);

        for (Animal animal : listaAnimales) {
            animal.comer(placton);
            System.out.println(animal.getPeso());
        }
        Trucha tAlimento = new Trucha();
        tAlimento.setPeso(10);
        tAlimento.setNombre("Coral");

        listaAnimales.forEach(animal -> {
            animal.comer(tAlimento);
            System.out.println(animal.getPeso());
        });

        Oso tAlimentoOso = oso;
        listaAnimales.forEach(animal -> {
            animal.comer(tAlimentoOso);
            System.out.println(animal.getPeso());
        });
    }

    /**
     * Clases anónimas: Cuando creas la clase y el objeto a la vez
     * Se llama clase anónima porque no se podrá crear otra vez esa misma clase.
     */

    Animal animal = new Animal() {
        @Override
        public void comer(Object o) {
            if (o instanceof Trucha) {
                System.out.println("Soy un león y voy a comer una trucha");
            }
        }

    };

}
