public class Prenda {
    Tela tela;
    Color colorPrimario;
    Color colorSecundario;
    Categoria categoria;
    TipoPrenda tipoPrenda;

    Prenda(Tela _tela, Color _colorPrimario, Color _colorSecundario, Categoria _categoria, TipoPrenda _tipoPrenda){
        tela = _tela;
        colorPrimario = _colorPrimario;
        colorSecundario = _colorSecundario;
        categoria = _categoria;
        tipoPrenda = _tipoPrenda;
    }

    public Categoria categoria(){
        return  this.categoria;
    }

    public Color colorSecundario(){
        return this.colorSecundario;
    }

}
