import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Prenda extends Borrador {

    public Prenda(Borrador borrador) throws CreadorPrendaException {
        validarAtributos(new ArrayList<>(Arrays.asList(borrador.getTipoPrenda(),
                borrador.getTela(),
                borrador.getColorPrimario(),
                borrador.getTrama())));
        this.tipoPrenda = borrador.getTipoPrenda();
        this.tela = borrador.getTela();
        this.colorPrimario = borrador.getColorPrimario();
        this.colorSecundario = borrador.getColorSecundario();
        this.trama = borrador.getTrama();
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
