public class Borrador {
    protected TipoPrenda tipoPrenda = null;
    protected Tela tela = null;
    protected Color colorPrimario = null;
    protected Color colorSecundario = null;
    protected Trama trama = Trama.lisa;

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) { this.tipoPrenda = tipoPrenda; }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }




}
