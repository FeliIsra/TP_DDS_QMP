public class AgregarPrenda implements Propuesta {

    private Prenda prenda;

    public AgregarPrenda(Prenda prenda){
        this.prenda = prenda;
    }

    @Override
    public void aplicar(Guardarropa guardarropa) {
        guardarropa.addPrenda(prenda);
    }

    @Override
    public void desaplicar(Guardarropa guardarropa) {
        guardarropa.quitarPrenda(prenda);
}
}
