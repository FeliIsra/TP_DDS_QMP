import org.junit.Assert;
import org.junit.Test;

public class TestPrenda {


    Prenda remeraAlgodon;
    Prenda pantalonNegro;
    Borrador borrador = new Borrador();
    TipoPrenda remera = new TipoPrendaFactory().remera();
    TipoPrenda pantalon = new TipoPrendaFactory().pantalon();


    @Test
    public void creaPrendaCorrectamente()throws Exception{
        borrador.setTipoPrenda(remera);
        borrador.setTela(Tela.algodon);
        borrador.setColorPrimario(Color.CELESTE);
        borrador.setTrama(Trama.lisa);
        remeraAlgodon = borrador.crearPrenda();
        Assert.assertEquals(remeraAlgodon.categoria(), Categoria.SUPERIOR);
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNull() throws Exception {
        borrador.setTipoPrenda(pantalon);
        borrador.crearPrenda();
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNullColor() throws Exception {
        borrador.setTipoPrenda(pantalon);
        borrador.setTela(Tela.acetato);
        borrador.crearPrenda();
    }

    @Test(expected = CreadorPrendaException.class)
    public void telaNoDisponibleParaEseTipo() throws Exception{
        borrador.setTipoPrenda(pantalon);
        borrador.setTela(Tela.algodon);
    }


}
