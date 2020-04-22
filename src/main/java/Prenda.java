import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Prenda extends Borrador {

    public Prenda(BuilderPrenda builderPrenda) throws CreadorPrendaException {
        validarAtributos(new ArrayList<>(Arrays.asList(builderPrenda.getTipoPrenda(),
                builderPrenda.getTela(),
                builderPrenda.getColorPrimario(),
                builderPrenda.getTrama())));
        this.tipoPrenda = builderPrenda.getTipoPrenda();
        this.tela = builderPrenda.getTela();
        this.colorPrimario = builderPrenda.getColorPrimario();
        this.colorSecundario = builderPrenda.getColorSecundario();
        this.trama = builderPrenda.getTrama();
    }

    public Categoria categoria(){
        return  tipoPrenda.categoria();
    }

    public TipoPrenda tipoPrenda(){
        return tipoPrenda;
    }

    public void validarAtributos(ArrayList<Object> atributos) throws CreadorPrendaException {
        if(atributos.stream().anyMatch(Objects::isNull)){
            throw new CreadorPrendaException("Faltan atributos para crear la prenda");
        }
    }
}
