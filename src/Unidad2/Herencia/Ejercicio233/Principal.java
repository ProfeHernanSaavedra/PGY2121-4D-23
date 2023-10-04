
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Oferta tv = new Oferta("TV", 1, 200000, 2, "89'");
        Congelado helado = new Congelado(-3,2,100, 5, "CHOCOLO");
        Aseo poett = new Aseo("grande",3, 2000, 2, "pisos");
        Abarrote arroz = new Abarrote(2,4, 2500, 2, "grado 2");
        Oferta mac = new Oferta("MAC", 5, 650000, 1, "Note");
        
        Coleccion col = new Coleccion();
        col.agregarProducto(tv);
        col.agregarProducto(helado);
        col.agregarProducto(poett);
        col.agregarProducto(arroz);
        col.agregarProducto(mac);
        
        col.calcularTotalOfertas();
        System.out.println("*****");
        col.listarProductos();
        
        System.out.println("");
        System.out.println("************");
        
        mac.comentar("Muy bueno");
        
        
        
        
    }
    
}
