package interfaz;

/** Una interfaz es una delcaración de métodos abstractos
 * Será usada por otras clase que tengan que implementar su funcionalidad.
 */
public interface Movible {
    /**
     * Hace que el objeto se mueva a la mínima velocidad posible.
     */
    public void moverseLento();

    /**
     * Hace que el objeto se mueva a la máxima velocidad posible.
     */
    public void moverseRapido();

    /**
     * Hace que el objeto se mueva un número de metros pasado por parámetro.
     * @param x Número de metros que queremos mover.
     * @return Retorna la posición actual del objeto.
     */
    public int moverse(int x);
}
