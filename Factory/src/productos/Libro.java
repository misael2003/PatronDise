package productos;
import producto.Producto;

public  class Libro implements Producto {

    private String autor = "", titulo = "", reseña = "";
    private int numeroPaginas = 0,ISBN =0;
    private double precio = 0;

    public Libro(int ISBN,String autor, String titulo, String reseña, int numeroPaginas, double precio) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.reseña = reseña;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    @Override
    public String getDetalles(){
        return String.format("Libro: %s, Autor: %s, Reseña: %s, Paginas: %d", titulo, autor,reseña,numeroPaginas);
    }

}
