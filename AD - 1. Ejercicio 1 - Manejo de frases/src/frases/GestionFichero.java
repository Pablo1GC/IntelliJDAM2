package frases;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GestionFichero {
    private static final String NOMBRE_FICHERO = "frasesCelebres.txt";
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private int numFrases;

    public void creacionAperturaFichero() {
        try {
            FileWriter fw = new FileWriter(NOMBRE_FICHERO, true);
        } catch (IOException e) {
            System.out.println("No se puede abrir o crear el fichero");
            System.out.println(e.getMessage());
            return;
        }
    }

    public void gestionarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                introducirFrase();
                break;
            case 2:
                leerFrase();
                break;
            case 3:
                leerFraseAleatoria();
                break;
            case 4:
                System.out.println("¡Hasta luego!");
        }
    }

    public void introducirFrase() throws IOException {
        try (FileWriter fw = new FileWriter(NOMBRE_FICHERO, true);
             BufferedWriter pw = new BufferedWriter(fw);) {
            System.out.println("Introduzca una frase célebre:");
            pw.write(in.readLine());
            pw.newLine();
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerFrase() {
        creacionAperturaFichero();
        try (FileReader fr = new FileReader(NOMBRE_FICHERO);
             BufferedReader br = new BufferedReader(fr);) {
            String frase = br.readLine();
            while (frase != null) {
                System.out.println("Frase del fichero: " + frase);
                frase = br.readLine();
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void leerFraseAleatoria() throws IOException {
        creacionAperturaFichero();
        ArrayList almacenFrases = contarFrases();
        try {
            System.out.println("Frase del fichero aleatoria: " +
                    almacenFrases.get((int) (Math.random() * numFrases)));
            System.out.println();

        } catch (Exception e) {
            System.out.println("No hay frases en el fichero.");
            System.out.println();
        }
        numFrases = 0;
    }

    public ArrayList contarFrases() {
        ArrayList almacenFrases = new ArrayList();
        try (FileReader fr = new FileReader(NOMBRE_FICHERO);
             BufferedReader br = new BufferedReader(fr);) {
            String frase = br.readLine();
            while (frase != null) {
                almacenFrases.add(frase);
                frase = br.readLine();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        numFrases = almacenFrases.size();
        return almacenFrases;
    }
}
