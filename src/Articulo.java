public abstract class Articulo {
    private int id;
    private String nombre;
    private String marca;
    private int stock;
    private double precio;
    private int unidadesCompradas;

    public Articulo(int id, String nombre, String marca,
                    int stock, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }
    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String imprimir(){
        final StringBuilder sb = new StringBuilder();
        sb.append(id).append(". ");
        sb.append(nombre).append('\'').append(imprimirDetallesEspecificos());
        sb.append(", "+marca).append('\'');
        sb.append(", Precio: ").append(Util.formatearEuros((int) precio));
        return sb.toString();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(imprimir());
        sb.append(", Disponibles: ").append(stock);
        return sb.toString();
    }
    public String toStringCompradas(){
        final StringBuilder sb = new StringBuilder();
        sb.append(imprimir());
        sb.append(", comprado: "+unidadesCompradas).append('\'');
        return sb.toString();
    }

    protected abstract String imprimirDetallesEspecificos();
    public void decrementarStock(int cantidad) {
        this.stock -= cantidad;
    }
    public void incementarUnidadesCompradas(int unidades){
        this.unidadesCompradas+= unidades;
    }

    public abstract Articulo clonar();
}




