package entidad;
/** Es un tipo especial de clase en la que los objetos se crean cuando
 * se arranca el programa, y no puede haber mñas de los que se declaran
 * dentro del enumerador
 */
public enum Sexo {
    MACHO(1), HEMBRA(2), HERMAFRODITA(3);
    // Vamos a tener 3 objetos Sexo que serán estos.

    private int numeroGonadas;

    Sexo(int numeroGonadas){
        this.numeroGonadas = numeroGonadas;
    }

}
