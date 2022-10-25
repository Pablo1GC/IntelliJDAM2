package videojuego;

import java.io.Serializable;

public class Videojuego implements Serializable{

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String compania;
    private double notaMedia;

    public Videojuego(int id, String nombre, String compania, double notaMedia) {
        this.id = id;
        this.nombre = nombre;
        this.compania = compania;
        this.notaMedia = notaMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

}
