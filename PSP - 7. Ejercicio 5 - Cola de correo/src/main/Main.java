package main;

import email.ColaEmail;
import personajes.Destinatario;
import personajes.Remitente;

public class Main {

    public static void main(String[] args) {
        String[] arrayEmails = {"pepe@gmail.com", "alberto@gmail.com", "alex@gmail.com", "romelu@gmail.com",
                "lucas@gmail.com", "pikachu@gmail.com", "colocolo@gmail.com", "norberto@gmail.com",
                "moises@gmail.com", "chimy@gmail.com", "josele@gmail.com"};

        ColaEmail cola = new ColaEmail();

        cola.addListaNegra("pikachu@gmail.com");

        Remitente remitente1 = new Remitente("gerbasio@gmail.com", cola, arrayEmails);
        Remitente remitente2 = new Remitente("rigoberto@gmail.com", cola, arrayEmails);
        Remitente remitente3 = new Remitente("eustaquio@gmail.com", cola, arrayEmails);

        Destinatario destinatario1 = new Destinatario(cola);
        Destinatario destinatario2 = new Destinatario(cola);

        remitente1.start();
        remitente2.start();
        remitente3.start();

        destinatario1.start();
        destinatario2.start();
    }
}
