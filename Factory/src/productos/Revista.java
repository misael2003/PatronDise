package productos;
import producto.Producto;

public class Revista implements Producto {

    private int ISSN = 0, numeroEdicion= 0, periodicidad = 0;
    private String nombre = "";
    private float precio = 0;

    public Revista(int ISSN, int numeroEdicion, int periodicidad, String nombre, float precio) {
        this.ISSN = ISSN;
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getDetalles(){
        return String.format("Nombre: %s, Edicion: %d, Periodicidad: %d días",nombre,numeroEdicion,periodicidad);
    }
}
