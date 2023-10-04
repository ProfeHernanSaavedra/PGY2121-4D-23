
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Liquido extends Producto{
    
    private double gradosAlc;

    public Liquido() {
        super();
    }

    public Liquido(double gradosAlc, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradosAlc = gradosAlc;
    }

    public double getGradosAlc() {
        return gradosAlc;
    }

    public void setGradosAlc(double gradosAlc) {
        this.gradosAlc = gradosAlc;
    }

    @Override
    public String toString() {
        return "Liquido{" + "gradosAlc=" + gradosAlc + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: "  + super.getCantidad());
        System.out.println("Descripcion: " + super.getDescripcion());
        System.out.println("Grados de Alcohol: " + this.getGradosAlc());
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Comentario Liquidos: " + comentario);
    }
    
    
    
    
}
