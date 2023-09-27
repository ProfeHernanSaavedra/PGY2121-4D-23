
package Unidad2.Herencia.Ejercicio1;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        Musica ms = new Musica("ROCK", "admin", "admin", 120, 5);
        Television tv = new Television("SUSPENSO","adm", "123", 250, 2000);
        RedSocial rs = new RedSocial("Instagram","jperez", "jajaja", 350, 10000);
        
        Coleccion col = new Coleccion();
        
        col.agregarInteres(ms);
        col.agregarInteres(tv);
        col.agregarInteres(rs);
        
        col.listar();
        col.masLikes();
        System.out.println("***VISUALIZAR**");
        System.out.println(ms.visualizar());
        System.out.println(tv.visualizar());
        System.out.println(rs.visualizar());
        
    }
    
}
