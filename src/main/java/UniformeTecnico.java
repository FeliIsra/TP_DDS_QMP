public class UniformeTecnico extends UniformeFactory {

    @Override
    Prenda crearPrendaSuperior() throws CreadorPrendaException {
        return new Borrador()
                .setTrama(Trama.lisa)
                .setColorPrimario(Color.NEGRO)
                .setTipoPrenda(new TipoPrendaFactory().remera())
                .setTela(Tela.algodon)
                .crearPrenda();

    }

    @Override
    Prenda crearPrendaInferior() throws CreadorPrendaException {
        return new Borrador()
                .setTrama(Trama.lisa)
                .setColorPrimario(Color.NEGRO)
                .setTipoPrenda(new TipoPrendaFactory().pantalon())
                .setTela(Tela.gabardina)
                .crearPrenda();
    }

    @Override
    Prenda crearPrendaCalzado() throws CreadorPrendaException {
        return new Borrador()
                .setTrama(Trama.lisa)
                .setColorPrimario(Color.NEGRO)
                .setTipoPrenda(new TipoPrendaFactory().zapatillas())
                .setTela(Tela.lona)
                .crearPrenda();
    }
}
