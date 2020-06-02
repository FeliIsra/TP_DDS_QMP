
import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private Set<Prenda> prendas = new HashSet<>();
    private Borrador borrador;

    public void addPrendas(Prenda prenda){
        prendas.add(prenda);
    }

    public Set<Prenda> getPrendas() {
        return prendas;
    }

    public void guardarPrenda()throws CreadorPrendaException {
        this.addPrendas(borrador.crearPrenda());
    }

}