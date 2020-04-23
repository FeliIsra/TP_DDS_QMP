import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCrearUniformeTecnico {

    @Test
    public void TestCrearUniformeTecnico() throws CreadorPrendaException {
        Uniforme uniformeTecnico = new UniformeTecnico().crearUniforme();
        Prenda prendaSuperiorTenico = new Borrador()
                .setTrama(Trama.lisa)
                .setColorPrimario(Color.NEGRO)
                .setTipoPrenda(new TipoPrendaFactory().remera())
                .setTela(Tela.algodon)
                .crearPrenda();

        Assert.assertEquals(uniformeTecnico.getPrendaSuperior().categoria(), prendaSuperiorTenico.categoria());
    }
}
