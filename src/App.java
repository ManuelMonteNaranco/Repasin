public class App {

    public static void main(String[] args) {
        String[] nombresBebida = new String[]{
                "Energética", "Agua sin gas", "Aguan con gas", "Tónica", "Limonada", "Sangría", "Cerveza"
        };
        String[] marcasBebida = new String[]{
                "Red bull", "Schweppes", "Don Simón", "Mahou", "Evian"
        };
            String[] nombresComida = new String[]{
                "Jamon", "Arroz", "Tarta", "Lentejas", "Queso", "Galletas", "Pan"
        };
        String[] marcasComida = new String[]{
                "Blanca", "Joselito", "El Pozo", "Gallo", "Cuetara", "Bimbo"
        };
        String[] nombresRopa = new String[]{
                "Camiseta", "Pantalon", "Zapatillas", "Sudadera", "Chaleco", "Calcetines", "Abrigo"
        };
        String[] marcasRopa = new String[]{
                "Nike", "Levi´s", "Lacoste", "Adidas", "Volcanon", "Puma"
        };
        String[] color = new String[]{
                "Marron claro", "Gris", "Azul claro", "Negro", "Blanco", "Rojo"
        };



        Tienda tienda = new Tienda(100);
        tienda.inicializarbebidas(nombresBebida, marcasBebida,nombresComida,
                marcasComida, nombresRopa, marcasRopa, color);
        System.out.println(tienda.obtenerBebidas());

        Carrito carrito = new Carrito(tienda);
        carrito.comprar(2, 4);
        carrito.comprar(6, 40);
        carrito.comprar(21, 6);
        carrito.comprar(105, 10);
        carrito.comprar(33, 0);
        carrito.comprar(21, 3);
        System.out.println(carrito.obtenerDetalle());




        carrito.borrar(2);
        System.out.println(carrito.obtenerDetalle());

        //Decrementa las unidades compradas del artículo en el carrito. Si las unidades
        //son mayores o iguales que las presentes en el carrito, borra el artículo del
        //carrito
        carrito.devolver(21, 4);
        System.out.println(carrito.obtenerDetalle());
    }


}

