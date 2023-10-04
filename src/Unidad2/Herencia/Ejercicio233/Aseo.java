
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Aseo extends Producto{
    
    private String tamaño;

    public Aseo() {
        super();
    }

    public Aseo(String tamaño, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Aseo{" + "tama\u00f1o=" + tamaño + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: "  + super.getCantidad());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Tamaño: " + this.getTamaño());
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario Aseo: " + comentario);
    }
    
    
    
}
