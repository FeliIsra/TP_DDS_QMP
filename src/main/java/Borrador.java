public class Borrador {
    protected TipoPrenda tipoPrenda = null;
    protected Tela tela = null;
    protected Color colorPrimario = null;
    protected Color colorSecundario = null;
    protected Trama trama = Trama.lisa;

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Borrador setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
        return this;}

    public Tela getTela() {
        return tela;
    }

    public Borrador setTela(Tela tela) throws CreadorPrendaException {
        if(!this.getTipoPrenda().telasDisponibles().contains((tela))){
            throw new CreadorPrendaException("La tela elegida no puede usarse en este tipo de prenda");
        }
        this.tela = tela;
        return this;}

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public Borrador setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
        return this;}

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Borrador setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
        return this;}

    public Trama getTrama() {
        return trama;
    }

    public Borrador setTrama(Trama trama) {
        this.trama = trama;
        return this;
    }

    public Prenda crearPrenda() throws CreadorPrendaException { return new Prenda(this); }




}
