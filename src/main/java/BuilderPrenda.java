public class BuilderPrenda {

    private  Borrador borrador =  new Borrador();

    public void setTipoPrenda(TipoPrenda tipoPrenda){
        borrador.setTipoPrenda(tipoPrenda);
    }

    public void setTela(Tela tela) throws CreadorPrendaException {
        if(!borrador.getTipoPrenda().telasDisponibles().contains((tela))){
            throw new CreadorPrendaException("La tela elegida no puede usarse en este tipo de prenda");
        }
        borrador.setTela(tela);
    }

    public void setColorPrimario(Color coloPrimario){
        borrador.setColorPrimario(coloPrimario);
    }

    public void setColorSecundario(Color colorSecundario){
        borrador.setColorPrimario(colorSecundario);
    }

    public void setTrama(Trama trama){
        borrador.setTrama(trama);
    }

    public TipoPrenda getTipoPrenda(){
        return borrador.getTipoPrenda();
    }

    public Tela getTela(){
        return borrador.getTela();
    }

    public Color getColorPrimario(){
        return borrador.getColorPrimario();
    }

    public Color getColorSecundario(){
        return borrador.getColorSecundario();
    }

    public Trama getTrama(){
        return borrador.getTrama();
    }

    public Prenda crearPrenda() throws CreadorPrendaException {
        Prenda prenda = new Prenda(this);
        return prenda;
    }

}
