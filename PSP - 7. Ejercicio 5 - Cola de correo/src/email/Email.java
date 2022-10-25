package email;

import personajes.Destinatario;
import personajes.Remitente;

public class Email {
    private int id;
    private String destinatario;
    private Remitente remitente;
    private String asunto;
    private String bodyMensaje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getBodyMensaje() {
        return bodyMensaje;
    }

    public void setBodyMensaje(String bodyMensaje) {
        this.bodyMensaje = bodyMensaje;
    }
}
