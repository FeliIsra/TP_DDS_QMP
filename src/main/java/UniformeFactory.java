abstract class UniformeFactory {
    Uniforme crearUniforme() throws CreadorPrendaException {
        return new Uniforme(
                this.crearPrendaSuperior(),
                this.crearPrendaInferior(),
                this.crearPrendaCalzado()
        );
    }

    abstract Prenda crearPrendaSuperior() throws CreadorPrendaException;
    abstract Prenda crearPrendaInferior() throws CreadorPrendaException;
    abstract Prenda crearPrendaCalzado() throws CreadorPrendaException;
}
