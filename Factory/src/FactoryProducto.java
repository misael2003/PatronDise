import producto.Producto;
import productos.*;
public class FactoryProducto {
    public Producto crearProducto(String prodcuto){

        if (prodcuto.equals("Libro")){
            return new Libro(2332323,"Misael Bahena","C++","Muy buen libro",3,139.39);
        }

        if(prodcuto.equals("Revista")){
            return new Revista(2323,40,10,"JAVA",230);
        }

        if (prodcuto.equals("Periodico")){
            return new Periodico(23231,100,"UNIVERSAL","22-03-2023");
        }
        return null;
    }
}
