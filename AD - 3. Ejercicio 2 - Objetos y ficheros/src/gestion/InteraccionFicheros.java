package gestion;

import videojuego.Videojuego;

import java.io.*;
import java.util.ArrayList;

public class InteraccionFicheros {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private ArrayList<Videojuego> videojuegos = new ArrayList<>();
    private int id;

    public void introducirVideojuego() throws IOException {
        sacarVideojuegos();
        if (videojuegos != null) {
            id = videojuegos.get(videojuegos.size() - 1).getId() + 1;
        } else {
            id = 1;
        }
        System.out.println("Introduzca el nombre del videojuego:");
        String nombre = in.readLine();
        System.out.println("Introduzca la compañia creadora del videojuego:");
        String compania = in.readLine();
        System.out.println("Introduzca la nota del videojuego:");
        double notaMedia = 0.0;
        do {
            try {
                notaMedia = Double.parseDouble(in.readLine());
            } catch (Exception e) {
                System.out.println("Introduzca una nota válida.");
                System.out.println();
            }
        } while (notaMedia < 0 || notaMedia > 10);
        System.out.println();
        Videojuego videojuego = new Videojuego(id, nombre, compania, notaMedia);
        videojuegos.add(videojuego);
        guardarVideojuegos();
    }

    public void guardarVideojuegos() {
        try (FileOutputStream file = new FileOutputStream("videojuegos.dat");
             ObjectOutputStream buffer = new ObjectOutputStream(file)) {
            buffer.writeObject(videojuegos);
            System.out.println("Los videojuegos se han guardado con éxito");
            System.out.println();
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero");
            System.out.println();
            System.out.println(e.getMessage());
            return;
        }
    }

    public void sacarVideojuegos() {
        try (FileInputStream file = new FileInputStream("videojuegos.dat");
             ObjectInputStream buffer = new ObjectInputStream(file);) {

            videojuegos = (ArrayList<Videojuego>) buffer.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void leerVideojuego() throws IOException {
        System.out.println("Introduzca el ID del videojuego: ");
        id = Integer.parseInt(in.readLine());
        sacarVideojuegos();
        for (Videojuego v : videojuegos) {
            if (v.getId() == id) {
                System.out.println("Nombre: " + v.getNombre());
                System.out.println("Compañia: " + v.getCompania());
                System.out.println("Nota Media: " + v.getNotaMedia());
                System.out.println();
            }
        }
    }

    public void eliminarVideojuego() throws IOException {
        sacarVideojuegos();
        System.out.println("Introduzca el ID del videojuego a eliminar: ");
        id = Integer.parseInt(in.readLine());
        for (Videojuego v : videojuegos) {
            if (v.getId() == id) {
                videojuegos.remove(v);
                guardarVideojuegos();
                break;
            }
        }
    }

    public void mostrarVideojuegos() {
        sacarVideojuegos();
        for (Videojuego v : videojuegos) {
            System.out.println("ID: " + v.getId());
            System.out.println("Nombre: " + v.getNombre());
            System.out.println("Compañia: " + v.getCompania());
            System.out.println("Nota Media: " + v.getNotaMedia());
            System.out.println();
        }
    }
}

