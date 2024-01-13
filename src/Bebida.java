public class Bebida extends Articulo {

    private double graduacion;


    public Bebida(int id, String nombre, double graduacion,
                  String marca, int stock, double precio) {
        super(id, nombre, marca, stock, (int) precio);
        this.graduacion = graduacion;

    }

    @Override
    protected String imprimirDetallesEspecificos() {
        return String.valueOf(graduacion);
    }
    public Bebida clonar() {
        return new Bebida(getId(), getNombre(), this.graduacion,
                getMarca(), getStock(), getPrecio());
    }
}


