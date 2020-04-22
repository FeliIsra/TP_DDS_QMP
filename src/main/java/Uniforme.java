public class Uniforme {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda prendaCalzado;
    private Prenda prendaAccesorio;

    public Uniforme(BuilderUniforme builderUniforme){
        this.prendaSuperior = builderUniforme.getPrendaSuperior();
        this.prendaInferior = builderUniforme.getPrendaInferior();
        this.prendaCalzado = builderUniforme.getPrendaCalzado();
        this.prendaAccesorio = builderUniforme.getPrendaAccesorio();
    }
}
