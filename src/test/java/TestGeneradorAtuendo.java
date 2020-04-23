import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGeneradorAtuendo {
    Usuario felipe = new Usuario();
    Prenda remeraNegra;
    Prenda pantalonNegro;
    Prenda zapatillasBlancas;
    Prenda lentesDeSolNegros;
    Prenda remeraBlanca;
    TipoPrenda remera;
    TipoPrenda pantalon;
    TipoPrenda lentes;
    TipoPrenda zapatillas;
    Borrador borrador;
    TipoPrendaFactory tipoPrendaFactory;
    GeneradorAtuendos generadorDeAtuendos;

    @Before
    public void init() throws Exception{

        generadorDeAtuendos = new GeneradorAtuendos();

        borrador = new Borrador();

        tipoPrendaFactory = new TipoPrendaFactory();

        remera = tipoPrendaFactory.remera();
        pantalon = tipoPrendaFactory.pantalon();
        lentes = tipoPrendaFactory.anteojo();
        zapatillas = tipoPrendaFactory.zapatillas();

        //remeraNegra
        borrador.setTipoPrenda(remera);
        borrador.setTela(Tela.algodon);
        borrador.setColorPrimario(Color.NEGRO);
        remeraNegra = borrador.crearPrenda();

        //remeraBlanca
        borrador.setTipoPrenda(remera);
        borrador.setTela(Tela.algodon);
        borrador.setColorPrimario(Color.BLANCO);
        remeraBlanca = borrador.crearPrenda();

        //pantalon
        borrador.setTipoPrenda(pantalon);
        borrador.setTela(Tela.gabardina);
        borrador.setColorPrimario(Color.NEGRO);
        pantalonNegro = borrador.crearPrenda();

        //lentes
        borrador.setTipoPrenda(lentes);
        borrador.setTela(Tela.plastico);
        borrador.setColorPrimario(Color.NEGRO);
        lentesDeSolNegros = borrador.crearPrenda();

        //zapatillas
        borrador.setTipoPrenda(zapatillas);
        borrador.setTela(Tela.lona);
        borrador.setColorPrimario(Color.BLANCO);
        zapatillasBlancas = borrador.crearPrenda();

        felipe.addPrendas(remeraBlanca);
        felipe.addPrendas(remeraNegra);
        felipe.addPrendas(pantalonNegro);
        felipe.addPrendas(lentesDeSolNegros);
        felipe.addPrendas(zapatillasBlancas);
    }

    @Test
    public void daBien(){
        Assert.assertEquals(4,generadorDeAtuendos.generarAtuendosValidos(felipe.getPrendas()).size());
    }
}
