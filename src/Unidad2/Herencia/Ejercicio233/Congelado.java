
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Congelado extends Producto{
    
    private double temperatura;

    public Congelado() {
        super();
    }

    public Congelado(double temperatura, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Congelado{" + "temperatura=" + temperatura + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: "  + super.getCantidad());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Temperatura: " + this.getTemperatura());
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario Congelado: " + comentario);
    }
    
    
    
}
