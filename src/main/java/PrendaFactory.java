public class PrendaFactory {
    String tela = "";
    String colorPrimario = "";;
    String colorSecundario;
    Categoria categoria = null;
    TipoPrenda tipoPrenda = null;

    public Prenda crearPrenda(){
        if(tela != "" && colorPrimario != ""  && ChequeadorCategoriaTipoPrenda.chequea(categoria, tipoPrenda)){

            return new Prenda(tela, colorPrimario, colorSecundario, categoria, tipoPrenda);
        }
        System.out.println("No se puede crear la prenda");
        return null;
    }
}
