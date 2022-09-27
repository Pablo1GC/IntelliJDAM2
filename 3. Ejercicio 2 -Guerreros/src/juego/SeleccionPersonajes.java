package juego;

import armas.*;
import personajes.*;

import java.util.Scanner;

public class SeleccionPersonajes {
    Scanner scan = new Scanner(System.in);
    Object arma1 = new Object();
    Object arma2 = new Object();

    public Personaje seleccionPersonaje1() {
        System.out.println("¿Cómo se llama tu personaje?");
        String nombre = scan.nextLine();

        int nivel;
        do {
            System.out.println("¿Cúal es tu nivel? (120 MAX)");
            nivel = scan.nextInt();
        }
        while (nivel < 1 || nivel > 121);

        int p1;
        do {
            System.out.println("Seleccione su personaje: [1] Guerrero, [2] Mago, [3] Curandero.");
            p1 = scan.nextInt();
        } while (p1 < 1 || p1 > 3);

        int a1;
        do {
            System.out.println("Seleccione su arma: [1] Espada, [2] Arco, [3] Hechizo, [4] Rezo.");
            a1 = scan.nextInt();
        } while (a1 < 1 || a1 > 4);

        if (a1 == 1) {
            arma1 = new Espada();
        } else if (a1 == 2) {
            arma1 = new Arco();
        } else if (a1 == 3) {
            arma1 = new Hechizo();
        } else {
            arma1 = new Rezo();
        }
        if (p1 == 1) {
            Guerrero guerrero = new Guerrero((Arma) arma1, nombre, nivel);
            return guerrero;
        } else if (p1 == 2) {
            Mago mago = new Mago((Arma) arma1, nombre, nivel);
            return mago;
        } else {
            Curandero curandero = new Curandero((Arma) arma1, nombre, nivel);
            return curandero;
        }
    }

    public Personaje seleccionPersonaje2() {

        System.out.println("¿Cómo se llama su oponente?");
        scan.nextLine();
        String nombre2 = scan.nextLine();

        int nivel2;
        do {
            System.out.println("¿Cúal es el nivel de su oponente? (120 MAX)");
            nivel2 = scan.nextInt();
        } while (nivel2 < 1 || nivel2 > 121);

        int p2;
        do{
            System.out.println("Seleccione a su enemigo: [1] Guerrero, [2] Mago, [3] Curandero.");
            scan.nextLine();
            p2 = scan.nextInt();
        } while (p2 < 1 || p2 > 3);

        int a2;
        do {
            System.out.println("Seleccione el arma de su enemigo: [1] Espada, [2] Arco, [3] Hechizo, [4] Rezo.");
            scan.nextLine();
            a2 = scan.nextInt();
        } while (a2 < 1 || a2 > 4);

        if (a2 == 1) {
            arma2 = new Espada();
        } else if (a2 == 2) {
            arma2 = new Arco();
        } else if (a2 == 3) {
            arma2 = new Hechizo();
        } else {
            arma2 = new Rezo();
        }
        if (p2 == 1) {
            Guerrero guerrero = new Guerrero((Arma) arma2, nombre2, nivel2);
            return guerrero;
        } else if (p2 == 2) {
            Mago mago = new Mago((Arma) arma2, nombre2, nivel2);
            return mago;
        } else {
            Curandero curandero = new Curandero((Arma) arma2, nombre2, nivel2);
            return curandero;
        }
    }
}




