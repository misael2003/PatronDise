// Ponemos en practica el patron Factory
import producto.Producto;
public class main {
    public static void main(String[] args) {
        FactoryProducto prodcutos = new FactoryProducto();

        Producto productoUno = prodcutos.crearProducto("Libro");
        System.out.println(productoUno.getDetalles());

        Producto productoDos = prodcutos.crearProducto("Revista");
        System.out.println(productoDos.getDetalles());

        Producto productoTres = prodcutos.crearProducto("Periodico");
        System.out.println(productoTres.getDetalles());
    }
}
