public class BuilderUniforme {

    private Prenda prendaSuperior = null;
    private Prenda prendaInferior = null;
    private Prenda prendaCalzado = null;
    private Prenda prendaAccesorio = null;

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public void setPrendaSuperior(Prenda prendaSuperior) throws CreadorUniformeException {
        validarPrenda(prendaSuperior, Categoria.SUPERIOR);
        this.prendaSuperior = prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public void setPrendaInferior(Prenda prendaInferior) throws CreadorUniformeException {
        validarPrenda(prendaInferior, Categoria.INFERIOR);
        this.prendaInferior = prendaInferior;
    }

    public Prenda getPrendaCalzado() {
        return prendaCalzado;
    }

    public void setPrendaCalzado(Prenda prendaCalzado) throws CreadorUniformeException {
        validarPrenda(prendaCalzado, Categoria.CALZADO);
        this.prendaCalzado = prendaCalzado;
    }

    public Prenda getPrendaAccesorio() {
        return prendaAccesorio;
    }

    public void setPrendaAccesorio(Prenda prendaAccesorio) throws CreadorUniformeException {
        validarPrenda(prendaAccesorio, Categoria.ACCESORIO);
        this.prendaAccesorio = prendaAccesorio;
    }

    public Uniforme crearUniforme(){
        Uniforme uniforme = new Uniforme(this);
        return  uniforme;
    }

    private void validarPrenda(Prenda prenda, Categoria categoria) throws CreadorUniformeException {
        if (prenda.categoria() != categoria){
            throw new CreadorUniformeException("La categoria de la es" + prenda.categoria().toString() + "y la categoria solicitada es " + categoria.toString());
        }
    }

}
