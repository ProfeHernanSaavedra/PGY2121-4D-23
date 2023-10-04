
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Oferta extends Producto{
    
    private String nombre;

    public Oferta() {
        super();
    }

    public Oferta(String nombre, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Oferta{" + "nombre=" + nombre + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: "  + super.getCantidad());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Nombre: " + this.getNombre());
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario Oferta: " + comentario);
        double calculo = IComentario.IVA * super.getPrecio();
        System.out.println("El IVA del precio es: " + calculo);
    }
    
    
    
}
