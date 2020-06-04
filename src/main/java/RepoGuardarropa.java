import java.util.ArrayList;
import java.util.List;

public class RepoGuardarropa {

    private static RepoGuardarropa single_instance = null;
    private List<Guardarropa> guardarropas;

    private RepoGuardarropa(){ }

    public static RepoGuardarropa getInstance(){
        if(single_instance == null){
            single_instance = new RepoGuardarropa();
        }

        return single_instance;
    }

    public void addGuardarropa(Guardarropa guardarropa){ guardarropas.add(guardarropa); }

    public void quitarGuardarropa(Guardarropa guardarropa) { guardarropas.remove(guardarropa); }

    public List<Guardarropa> getGuardarropas() { return guardarropas; }

    public List<Guardarropa> guardarropasDe (Usuario usuario){
        return (List<Guardarropa>) guardarropas
                .stream()
                .filter(g -> g.getUsuarios().contains(usuario));
    }
}
