package interfaz;

public class Almacen<T, E extends Movible> {
    private T objeto1;
    private E objeto2;

    public T getObjeto1() {
        return objeto1;
    }

    public void setObjeto1(T objeto1) {
        this.objeto1 = objeto1;
    }

    public E getObjeto2() {
        return objeto2;
    }

    public void setObjeto2(E objeto2) {
        this.objeto2 = objeto2;
    }
}
