import java.util.ArrayList;
import java.util.Objects;

public class PrendaFactory {
    Tela tela = null;
    Color colorPrimario = null;
    Color colorSecundario = null;
    Categoria categoria = null;
    TipoPrenda tipoPrenda = null;

    PrendaFactory(Tela _tela, Color _colorPrimario, Color _colorSecundario, Categoria _categoria, TipoPrenda _tipoPrenda){
        tela = _tela;
        colorPrimario = _colorPrimario;
        colorSecundario = _colorSecundario;
        categoria = _categoria;
        tipoPrenda = _tipoPrenda;
    }



    public Prenda crearPrenda() throws PrendaFactoryExpecion {
        if(tela != null && colorPrimario != null  && ChequeadorCategoriaTipoPrenda.chequea(categoria, tipoPrenda)){

            return new Prenda(tela, colorPrimario, colorSecundario, categoria, tipoPrenda);
        }
        throw new PrendaFactoryExpecion("No se puede crear la prenda");
    }
}
