import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class GeneradorAtuendos {

    private static GeneradorAtuendos generadorAtuendos;
    private ArrayList<Categoria> categoriasObligatorias = new ArrayList<>(Arrays.asList(
            Categoria.SUPERIOR,
            Categoria.INFERIOR,
            Categoria.CALZADO));

    public static GeneradorAtuendos getSingletonInstance() {
        if(generadorAtuendos == null) {
            generadorAtuendos = new GeneradorAtuendos();
        }
        return generadorAtuendos;
    }

    public Set<Atuendo> generarAtuendosValidos(Set<Prenda> prendas){
        Set<Set<Prenda>> todasLasCombinaciones = Sets.powerSet(prendas);
        Set<Set<Prenda>> atuendosValidos = filtrarAtuendosValidos(todasLasCombinaciones);
        Set<Atuendo> atuendos = atuendosValidos.stream().map(A -> new Atuendo(A)).collect(Collectors.toSet());

        return  atuendos;
    }

    private boolean esCombinacionValida(Set<Prenda> prendas){
        return esUnAtuendo(prendas) && tiposDiferentes(prendas);
    }

    private boolean esUnAtuendo(Set<Prenda> prendas){
        return  categoriasObligatorias.stream().allMatch(C -> prendas.stream().anyMatch(P -> P.categoria() == C));
    }

    private boolean tiposDiferentes(Set<Prenda> prendas){
        return  prendas.size() == prendas.stream().map(P -> P.tipoPrenda()).distinct().count();
    }

    private Set<Set<Prenda>> filtrarAtuendosValidos(Set<Set<Prenda>> todasLasCombinaciones){
        return todasLasCombinaciones.stream().filter(this::esCombinacionValida).collect(Collectors.toSet());
    }


    private boolean validarTemperatura(Set<Prenda> prendas){
        return  prendas.stream().allMatch(P -> this.temperaturaValida(P));
    }


    private boolean temperaturaValida(Prenda prenda){

        TiempoAPI api = new AccuWeatherAPI();
        double temperatura = api.temperatura("Buenos Aires, Argentina");

        return prenda.getLimiteTemperatura() < temperatura;
    }
}
