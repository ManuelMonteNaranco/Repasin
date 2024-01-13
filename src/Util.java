import static java.lang.String.format;

public class Util {
    public static Articulo buscarArticulo(Articulo[] articulos, int id){
        for (Articulo aux: articulos) {
            if (aux != null && aux.getId() == id ){
                return aux;
            }
        }

        return null;
    }
    public static String formatearEuros(int cantidad){
        return format("%2f€", cantidad);
    }
}
