public class Comida extends Articulo{
private double peso;
private int calorias;
    public Comida(int id, String nombre, String marca, int stock, double precio
    , double peso, int calorias) {
        super(id, nombre, marca, stock, (int) precio);
        this.peso = peso;
        this.calorias = calorias;
    }
    @Override
    protected  String imprimirDetallesEspecificos(){
        return null;

    }
    @Override
    public  Comida clonar(){
        return new Comida(getId(), getNombre(), getMarca(),
                getStock(), getPrecio(),this.peso, this.calorias);
    }
}
