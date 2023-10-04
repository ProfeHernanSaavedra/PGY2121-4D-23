
package Unidad2.Herencia.Ejercicio233;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Producto> listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
    }
    
    public boolean agregarProducto(Producto prod)
    {
        return listaProductos.add(prod);
    }
    
    public void listarProductos()
    {
        int suma = 0;
        System.out.println("Codigo  Descripcion      Precio     Cantidad     Total");
        for (Producto prod : listaProductos) {
            System.out.println(prod.codigo + "\t" + prod.getDescripcion() + "\t\t"+prod.getPrecio()+ "\t\t"+prod.getCantidad() + "\t"+prod.getPrecio()*prod.getCantidad() );
            suma = suma + prod.getCantidad() * prod.getPrecio();
        }
        System.out.println("                   ---------------------------------------");
        System.out.println("                          El total a pagar es: $ "  + suma);
    }
    
    public void calcularTotalOfertas()
    {
        int suma =0;
        for (Producto prod : listaProductos) {
//            String clase = prod.getClass().getName();
//            System.out.println(clase);
            if (prod.getClass().getName().equalsIgnoreCase("Unidad2.Herencia.Ejercicio233.Oferta")) {
                
                suma = suma + prod.getCantidad()*prod.getPrecio();
                
            }
        }
        System.out.println("El total a pagar en Oferta es: $" + suma);
    }
    
    
    
    
    
}
