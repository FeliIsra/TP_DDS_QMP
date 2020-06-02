public class EliminarPrenda implements Propuesta {

    private Prenda prenda;

    public EliminarPrenda(Prenda prenda){
        this.prenda = prenda;
    }


    @Override
    public void aplicar(Guardarropa guardarropa) {
        guardarropa.quitarPrenda(prenda);
    }

    @Override
    public void desaplicar(Guardarropa guardarropa) {
        guardarropa.addPrenda(prenda);
    }
}
