import java.util.ArrayList;

public class TipoPrenda {
    private Categoria categoria;
    private ArrayList<Tela> telasDisponibles;

    public TipoPrenda(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria categoria(){
        return categoria;
    }

    public void agregarTelasDisponibles(ArrayList<Tela> telas){
        this.telasDisponibles = telas;
    }

    public ArrayList<Tela> telasDisponibles(){
        return telasDisponibles;
    }
}
