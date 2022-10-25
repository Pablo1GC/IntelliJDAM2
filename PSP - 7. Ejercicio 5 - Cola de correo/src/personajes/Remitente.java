package personajes;

import email.ColaEmail;
import email.Email;

public class Remitente extends Thread {
    private String nombre;
    private ColaEmail cola;
    private static int id;
    private String[] arrayEmails;

    public Remitente(String nombre, ColaEmail cola, String[] arrayEmails) {
        super();
        this.nombre = nombre;
        this.cola = cola;
        this.arrayEmails = arrayEmails;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            id++;
            Email email = new Email();
            email.setId(id);
            email.setRemitente(this);
            email.setAsunto("Mensaje " + id);
            email.setBodyMensaje("Este es el email número " + id + " de " + nombre);
            email.setDestinatario(arrayEmails[i]);
            if (cola.addEmail(email)) {

                System.out.println("--------------------------------- [AÑADIDO] ---------------------------------");
                System.out.println("--> Se está enviando el mensaje - ID: " + email.getId() + " - Remitente " + nombre + " <--");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println();
            } else {
                System.out.println("---------------------------------  [BLOCK]  ---------------------------------");
                System.out.println("El email " + email.getDestinatario() + " está bloqueado en el sistema.");
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println();
            }
        }
    }
}
