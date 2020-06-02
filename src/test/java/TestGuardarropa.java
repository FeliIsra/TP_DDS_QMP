import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class TestGuardarropa {

    Propuesta agregarRemera;
    Propuesta agregarPantalon;
    Propuesta eliminarRemera;
    Propuesta eliminarPantalon;
    Guardarropa guardarropa;
    Prenda remeraAlgodon;
    Prenda pantalonNegro;
    Borrador borrador = new Borrador();
    TipoPrenda remera = new TipoPrendaFactory().remera();
    TipoPrenda pantalon = new TipoPrendaFactory().pantalon();

    @Before
    public void init() throws CreadorPrendaException {
        borrador.setTipoPrenda(remera);
        borrador.setTela(Tela.algodon);
        borrador.setColorPrimario(Color.NEGRO);
        borrador.setTrama(Trama.lisa);
        remeraAlgodon = borrador.crearPrenda();

        borrador.setTipoPrenda(pantalon);
        borrador.setTela(Tela.gabardina);
        borrador.setColorPrimario(Color.NEGRO);
        borrador.setTrama(Trama.lisa);
        pantalonNegro = borrador.crearPrenda();

        agregarRemera = new AgregarPrenda(remeraAlgodon);
        agregarPantalon = new AgregarPrenda(pantalonNegro);
        eliminarRemera = new EliminarPrenda(remeraAlgodon);
        eliminarPantalon = new EliminarPrenda(pantalonNegro);

        guardarropa = new Guardarropa();
    }

    @Test
    public void AgregarPropuestas(){
        guardarropa.addPropuesta(agregarPantalon);
        guardarropa.addPropuesta(agregarRemera);
        guardarropa.addPropuesta(eliminarPantalon);
        guardarropa.addPropuesta(eliminarRemera);
        Assert.assertEquals(guardarropa.getPropuestas().size(), 4);
    }

    @Test
    public void AgregarPrendaConPropuesta(){
        guardarropa.addPropuesta(agregarRemera);
        guardarropa.aplicarPropuestas();
        Assert.assertEquals(guardarropa.getPrendas().size(), 1);
    }

    @Test
    public void QuitarPrendaConPropuesta(){
        guardarropa.addPrenda(remeraAlgodon);
        guardarropa.addPropuesta(eliminarRemera);
        guardarropa.aplicarPropuestas();
        Assert.assertEquals(guardarropa.getPrendas().size(), 0);
    }

    @Test
    public void DeshacerPropuestas() {
        guardarropa.addPropuesta(agregarRemera);
        guardarropa.addPropuesta(agregarPantalon);
        guardarropa.aplicarPropuestas();
        guardarropa.deshacerPropuestas();
        Assert.assertEquals(guardarropa.getPrendas().size(), 0);
    }

    @Test
    public void DeshacerPropuestaDeAgregar() {
        guardarropa.addPropuesta(agregarPantalon);
        guardarropa.aplicarPropuestas();
        guardarropa.deshacerPropuestas();
        Assert.assertEquals(guardarropa.getPrendas().size(), 0);
    }

    @Test
    public void DeshacerPropuestaDeEliminar(){
        guardarropa.addPrenda(remeraAlgodon);
        guardarropa.addPropuesta(eliminarRemera);
        guardarropa.aplicarPropuestas();
        guardarropa.deshacerPropuestas();
        Assert.assertEquals(guardarropa.getPrendas().size(), 1);
    }
}
