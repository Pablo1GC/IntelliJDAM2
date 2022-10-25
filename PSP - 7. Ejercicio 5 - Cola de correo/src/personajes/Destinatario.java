package personajes;

import email.ColaEmail;
import email.Email;

public class Destinatario extends Thread {

    private ColaEmail cola;

    public Destinatario(ColaEmail cola) {
        super();
        this.cola = cola;
    }

    public void run() {
        while (true) {

            Email email = cola.getEmail(this);

            System.out.println("--------------------------------- [ENVIADO] ---------------------------------");
            System.out.println("Remitente: " + email.getRemitente().getNombre());
            System.out.println("******************************************************************************");
            System.out.println("Destinatario: " + email.getDestinatario());
            System.out.println("******************************************************************************");
            System.out.println("Asunto: " + email.getAsunto());
            System.out.println("******************************************************************************");
            System.out.println("Mensaje: " + email.getBodyMensaje());
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println();
        }
    }
}

