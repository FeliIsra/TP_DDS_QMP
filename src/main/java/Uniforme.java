public class Uniforme {
    private Prenda prendaSuperior;
    private Prenda prendaInferior;
    private Prenda prendaCalzado;

    public Prenda getPrendaSuperior() {
        return prendaSuperior;
    }

    public void setPrendaSuperior(Prenda prendaSuperior) {
        this.prendaSuperior = prendaSuperior;
    }

    public Prenda getPrendaInferior() {
        return prendaInferior;
    }

    public void setPrendaInferior(Prenda prendaInferior) {
        this.prendaInferior = prendaInferior;
    }

    public Prenda getPrendaCalzado() {
        return prendaCalzado;
    }

    public void setPrendaCalzado(Prenda prendaCalzado) {
        this.prendaCalzado = prendaCalzado;
    }



    Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.prendaCalzado = prendaCalzado;
    }

}
