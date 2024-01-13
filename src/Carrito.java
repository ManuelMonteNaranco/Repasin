public class Carrito {

    Articulo[] articulosComprados = new Articulo[10];
    Tienda tienda;
    private int posicion = 0;

    public Carrito(Tienda tienda) {
        this.tienda = tienda;
    }

    public void comprar(int id, int cantidad) {
        if (posicion >= this.articulosComprados.length) {
            System.out.println("EL carrito esta lleno . no puedes comprar mas");

        } else {
            if (cantidad > 0) {
                //buscar producto por id

                Articulo articulo = Util.buscarArticulo(tienda.getBebida(), id);


                if (articulo == null) {
                    System.out.println("Error, Bebida incorrecta");
                } else {
                    if (cantidad <= articulo.getStock()) {
                        articulo.decrementarStock(cantidad);
                        this.insertarCompra(articulo, cantidad);
                    } else {
                        System.out.println("No hay suficiente stock" + articulo.getStock());
                        this.insertarCompra(articulo, articulo.getStock());

                        articulo.decrementarStock(cantidad);
                    }

                }
                //Meter en carrito

                //Decrementa stock
            }
        }
    }

    private void insertarCompra(Articulo articulo, int cantidad) {
        Articulo comprado = articulo.clonar();
        comprado.setUnidadesCompradas(cantidad);

        Articulo aux = Util.buscarArticulo(this.articulosComprados, articulo.getId());

        if (aux != null) {

            this.articulosComprados[posicion] = comprado;
            posicion++;
        } else {
            aux.incementarUnidadesCompradas(cantidad);
        }
    }
        public String obtenerDetalle() {
            StringBuilder sb = new StringBuilder();
            double total = 0;

            for (Articulo articulo : this.articulosComprados) {
                if (articulo != null){
                    sb.append(articulo.toStringCompradas());
                    sb.append("\n");
                    total += articulo.getUnidadesCompradas() * articulo.getPrecio();
                }
            }
            sb.append("Precio total: ").append(total);

            return sb.toString();
        }

    public void devolver(int id, int cantidad) {
        for (int i = 0; i < this.articulosComprados.length ; i++) {
            Articulo aux = this.articulosComprados[i];
            if (aux != null && aux.getId() == id){
                for (int j = i; j < this.articulosComprados.length -1 ; j++){
                    this.articulosComprados[j] = this.articulosComprados[j+1];
                posicion--;
                }
            }
        }
        this.articulosComprados[this.articulosComprados.length-1] = null;
    }

    public void borrar(int id) {
        int cantidad = 0;
        for (int i = 0; i < this.articulosComprados.length; i++) {
            Articulo aux = this.articulosComprados[i];
            if (aux != null && aux.getId() == id){
                int unidadesCompradas = aux.getUnidadesCompradas();
                aux.setUnidadesCompradas(unidadesCompradas - cantidad);
                Articulo articuloTienda = Util.buscarArticulo(tienda.getBebida(), id);
                articuloTienda.incementarUnidadesCompradas(unidadesCompradas);

                if ( aux.getUnidadesCompradas() <= 0){
                    this.borrar(id);
                }
            }

        }
    }

}

