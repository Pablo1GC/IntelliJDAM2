package email;

import personajes.Destinatario;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ColaEmail {

    private final static int MAX_ELEMENTOS = 5;

    private Queue<Email> cola = new LinkedList<>();

    private ArrayList<String> listaNegra = new ArrayList<>();

    public void addListaNegra(String nombre) {
        listaNegra.add(nombre);
    }

    public synchronized Boolean addEmail(Email email) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!listaNegra.contains(email.getDestinatario())) {
            while (cola.size() == MAX_ELEMENTOS) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            cola.offer(email);
            notify();
            return true;
        } else {
            notify();
            return false;
        }
    }

    public synchronized Email getEmail(Destinatario destinatario) {
        while (cola.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Email s = cola.poll();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        return s;
    }
}

