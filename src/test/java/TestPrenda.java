import org.junit.Assert;
import org.junit.Test;

public class TestPrenda {


    @Test
    public void crearPrendaBien()throws Exception {
        Prenda remeraMangaCortaNegraDeAlgodon = new PrendaFactory(Tela.ALGODON,
                Color.NEGRO,
                Color.AMARILLO,
                Categoria.SUPERIOR,
                TipoPrenda.REMERA_MANGA_CORTA
                ).crearPrenda();
        Assert.assertEquals(remeraMangaCortaNegraDeAlgodon.categoria(), Categoria.SUPERIOR);
    }

    @Test
    public void crearPrendaSinColorSecundario() throws Exception{
        Prenda remeraSinColorSecundario = new PrendaFactory(
                Tela.ALGODON,
                Color.AMARILLO,
                null,
                Categoria.SUPERIOR,
                TipoPrenda.REMERA_MANGA_CORTA
        ).crearPrenda();
        Assert.assertEquals(remeraSinColorSecundario.colorSecundario(), null);
    }

    @Test(expected = PrendaFactoryExpecion.class)
    public void noCreaPrendasConNull() throws Exception {
        Prenda pantalonNegro = new PrendaFactory(null, null, null, null, null).crearPrenda();
    }

    @Test(expected = PrendaFactoryExpecion.class)
    public void noCoincidenTipoPrendaYCategoria() throws  Exception{
        Prenda pantalon = new PrendaFactory(Tela.ALGODON, Color.AMARILLO, Color.AZUL, Categoria.SUPERIOR, TipoPrenda.PANATALON).crearPrenda();
    }



}
