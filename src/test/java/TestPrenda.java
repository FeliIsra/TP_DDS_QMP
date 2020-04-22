import org.junit.Assert;
import org.junit.Test;

public class TestPrenda {


    Prenda remeraAlgodon;
    Prenda pantalonNegro;
    BuilderPrenda builder = new BuilderPrenda();
    TipoPrenda remera = new TipoPrendaFactory().remera();
    TipoPrenda pantalon = new TipoPrendaFactory().pantalon();


    @Test
    public void creaPrendaCorrectamente()throws Exception{
        builder.setTipoPrenda(remera);
        builder.setTela(Tela.algodon);
        builder.setColorPrimario(Color.CELESTE);
        builder.setTrama(Trama.lisa);
        remeraAlgodon = builder.crearPrenda();
        Assert.assertEquals(remeraAlgodon.categoria(), Categoria.SUPERIOR);
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNull() throws Exception {
        builder.setTipoPrenda(pantalon);
        builder.crearPrenda();
    }

    @Test(expected = CreadorPrendaException.class)
    public void noCreaPrendasConNullColor() throws Exception {
        builder.setTipoPrenda(pantalon);
        builder.setTela(Tela.acetato);
        builder.crearPrenda();
    }

    @Test(expected = CreadorPrendaException.class)
    public void telaNoDisponibleParaEseTipo() throws Exception{
        builder.setTipoPrenda(pantalon);
        builder.setTela(Tela.algodon);
    }


}
