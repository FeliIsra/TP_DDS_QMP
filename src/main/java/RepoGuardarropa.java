import java.util.ArrayList;
import java.util.List;

public class RepoGuardarropa {

    List<Guardarropa> guardarropas = new ArrayList<>();

    public void addGuardarropa(Guardarropa guardarropa){ guardarropas.add(guardarropa); }

    public void quitarGuardarropa(Guardarropa guardarropa) { guardarropas.remove(guardarropa); }

    public List<Guardarropa> getGuardarropas() { return guardarropas; }

    public List<Guardarropa> guardarropasDe (Usuario usuario){
        return (List<Guardarropa>) guardarropas
                .stream()
                .filter(g -> g.getUsuarios().contains(usuario));
    }
}
