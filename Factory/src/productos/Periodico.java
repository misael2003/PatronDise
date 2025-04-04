package productos;
import producto.Producto;

public class Periodico implements Producto {

    private int ID = 0;
    private float precio = 0;
    private String nombre = "", fechaPublicacion = "";

    public Periodico(int ID, float precio, String nombre, String fechaPublicacion) {
        this.ID = ID;
        this.precio = precio;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String getDetalles(){return String.format("Titulo:%s,Fecha de publicacion: %s",nombre,fechaPublicacion);
    }
}
