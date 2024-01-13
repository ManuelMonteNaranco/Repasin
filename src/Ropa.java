public class Ropa extends Articulo{
    private String color;

    public Ropa(int id, String nombre, String marca,
                int stock, double precio, int color) {
        super(id, nombre, marca, stock, precio);
        this.color = color;
    }

    @Override
    protected String imprimirDetallesEspecificos() {
        return null;
    }

    @Override
    public Articulo clonar() {
        return null;
    }
}
