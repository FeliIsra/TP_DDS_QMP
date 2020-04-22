import java.util.ArrayList;
import java.util.Arrays;

public class TipoPrendaFactory {
    public TipoPrenda remera() {
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.algodon,Tela.poliester)));
        return tipo;
    }

    public TipoPrenda chomba() {
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.algodon,Tela.pique)));
        return tipo;
    }

    public TipoPrenda campera(){
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.hilo,Tela.frisa,Tela.microfibra,Tela.rompeviento)));
        return tipo;
    }

    public TipoPrenda buzo(){
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.frisa,Tela.microfibra,Tela.algodon,Tela.polar)));
        return tipo;
    }

    public TipoPrenda sweater(){
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.hilo,Tela.lana)));
        return tipo;
    }

    public TipoPrenda camisa(){
        TipoPrenda tipo = new TipoPrenda(Categoria.SUPERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.oxford)));
        return tipo;
    }

    public TipoPrenda pantalon(){
        TipoPrenda tipo = new TipoPrenda(Categoria.INFERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.gabardina,Tela.jean,Tela.franela,Tela.acetato)));
        return tipo;
    }

    public TipoPrenda bermuda(){
        TipoPrenda tipo = new TipoPrenda(Categoria.INFERIOR);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.gabardina,Tela.jean)));
        return tipo;
    }

    public TipoPrenda anteojo(){
        TipoPrenda tipo = new TipoPrenda(Categoria.ACCESORIO);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.plastico)));
        return tipo;
    }

    public TipoPrenda gorra() {
        TipoPrenda tipo = new TipoPrenda(Categoria.ACCESORIO);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.jean,Tela.algodon)));
        return tipo;
    }

    public TipoPrenda gorro() {
        TipoPrenda tipo = new TipoPrenda(Categoria.ACCESORIO);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.jean,Tela.algodon,Tela.frisa)));
        return tipo;
    }

    public TipoPrenda zapatos() {
        TipoPrenda tipo = new TipoPrenda(Categoria.CALZADO);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.cuero)));
        return tipo;
    }

    public TipoPrenda zapatillas(){
        TipoPrenda tipo = new TipoPrenda(Categoria.CALZADO);
        tipo.agregarTelasDisponibles(new ArrayList<>(Arrays.asList(Tela.lona)));
        return tipo;
    }
}
