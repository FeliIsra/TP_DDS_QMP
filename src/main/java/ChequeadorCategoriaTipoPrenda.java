public class ChequeadorCategoriaTipoPrenda {

    public static boolean chequea(Categoria categoria, TipoPrenda prenda){
        switch(categoria){
            case CALZADO:
                return prenda == TipoPrenda.ZAPATO;
            case INFERIOR:
                return prenda == TipoPrenda.PANATALON || prenda == TipoPrenda.SHORT;
            case SUPERIOR:
                return  prenda == TipoPrenda.REMERA_MANGA_CORTA || prenda == TipoPrenda.REMERA_MANGA_LARGA;
            case ACCESORIO:
                return prenda == TipoPrenda.LENTES;
            default:
                return false;
        }
    }
}
