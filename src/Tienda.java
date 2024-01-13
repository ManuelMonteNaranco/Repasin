public class Tienda {

    private Articulo[] articulos;

    public Articulo[] getArticulos(){
        return articulos;
    }
    public Tienda (int maximoArticulos){
        this.articulos = new Articulo[maximoArticulos];
    }

    public void inicializarbebidas(String[] nombresBebida, String[] marcasBebida,
                                   String[] nombresComida, String[] marcasComida, String[] nombreRopa, String[] marcaRopa, int[] colores){

        for (int i = 0; i < this.articulos.length; i++){
            int aleatorio =(int) (Math.random()* 3 + 1);

                switch (aleatorio) {
                    case 1 -> this.articulos[i] = new Bebida(
                            i + 1,
                            nombresBebida[(int) (Math.random() * nombresBebida.length)],
                            Math.random() * 101,
                            marcasBebida[(int) (Math.random() * marcasBebida.length)],
                            (int) (Math.random() * 51),
                            Math.random() * 60 + 1
                    );
                    case 2 -> this.articulos[i] = new Comida(
                            i + 1,
                            nombresComida[(int) (Math.random() * nombresComida.length)],
                            marcasComida[(int) (Math.random() * marcasComida.length)],
                            (int) (Math.random() * 51),
                            (Math.random() * 60 + 1),
                            Math.random() * 951 + 50,
                            (int) (Math.random() * 600)
                    );
                    case 3 -> this.articulos[i] = new Ropa(
                            i + 1,
                            nombresComida[(int) (Math.random() * nombresComida.length)],
                            marcasComida[(int) (Math.random() * marcasComida.length)],
                            (int) (Math.random() * 51),
                            (Math.random() * 60 + 1),
                            colores[(int) (Math.random() * colores.length)]

                    );
                }
            }

        }





    public String obtenerBebidas(){
        StringBuilder sb = new StringBuilder();

        for (Articulo articulo1: this.articulos){
            sb.append(articulo1);
            sb.append("\n");
        }
        return sb.toString();

    }

    public Articulo[] getBebida() {
        return articulos;
    }



}
