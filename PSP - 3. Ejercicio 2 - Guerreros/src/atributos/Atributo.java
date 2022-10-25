package atributos;

public enum Atributo {
    INTELIGENCIA(1), FUERZA(2), SABIDURIA(3);

    private int numeroAtributo;
    Atributo(int numeroAtributo) {
        this.numeroAtributo = numeroAtributo;
    }
}
