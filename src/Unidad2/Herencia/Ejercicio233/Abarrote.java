
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Abarrote extends Producto{
    
    private double peso;

    public Abarrote() {
        super();
    }

    public Abarrote(double peso, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "peso=" + peso + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: "  + super.getCantidad());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Peso: " + this.getPeso());
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario Abarrotes: " + comentario);
    }
    
    
    
    
}
