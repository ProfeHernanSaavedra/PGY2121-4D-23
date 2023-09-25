
package Unidad2.EjemploHerencia;

import java.util.Date;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
       // Date fecha = new Date();
        
        Instagram insta = new Instagram(100, "En la mejor clases...", true, "admin", "admin");
        Twitter twit = new Twitter(200, "se quemo un bus", new Date(), "adm", "123"); 
         //Twitter twit = new Twitter(200, "se quemo un bus", fecha, usuario, password); 
         
         
         System.out.println("********************");
         System.out.println(insta.toString());
         System.out.println(twit.toString());
         insta.listar();
         System.out.println("********************");
         System.out.println(insta.visualizar());
         System.out.println(twit.visualizar());
         
    }
    
}
