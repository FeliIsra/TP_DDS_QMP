import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
    private List<Usuario> usuarios =  new ArrayList<>();
    private List<Prenda> prendas =  new ArrayList<>();
    private List<Propuesta> propuestas = new ArrayList<>();
    private List<Propuesta> propuestasAceptadas = new ArrayList<>();

    public void addPropuesta(Propuesta propuesta){ propuestas.add(propuesta); };

    public void addPrenda(Prenda prenda){ prendas.add(prenda); }

    public void quitarPrenda(Prenda prenda) { prendas.remove(prenda); }

    public void addUsuario(Usuario usuario){ usuarios.add(usuario); }

    public List<Usuario> getUsuarios() { return usuarios; }

    public List<Prenda> getPrendas() { return prendas; }

    public List<Propuesta> getPropuestas() { return propuestas; }

    public void aplicarPropuestas(){
        propuestas.stream().forEach(p -> p.aplicar(this));
        propuestasAceptadas.addAll(propuestas);
    }

    public void deshacerPropuestas(){
        propuestasAceptadas.stream().forEach(p -> p.desaplicar(this));
        propuestasAceptadas.removeAll(propuestasAceptadas);
    }

    public void aplicarPropuesta(Propuesta propuesta){
        propuesta.aplicar(this);
        propuestasAceptadas.add(propuesta);
    }

    public void desaplicarPropuesta(Propuesta propuesta){
        propuesta.desaplicar(this);
        propuestasAceptadas.remove(propuesta);
    }
}
