
package Unidad2.Herencia.Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Interes> listaInteres;

    public Coleccion() {
        
        listaInteres = new ArrayList<>();
    }
    
    public boolean agregarInteres(Interes interes){
        return listaInteres.add(interes);
    }
    
    public void listar()
    {
        for (Interes interes : listaInteres) {
            System.out.println(interes);
        }
    }
    
    public void masLikes()
    {
        int mayor = 0;
        String interesMayor="";
        for (Interes interes : listaInteres) {
            
            if (interes.getLikes() > mayor) {
                
                mayor = interes.getLikes();
                interesMayor = interes.getClass().getName();
            }  
        }
        switch (interesMayor) {
                    case "Unidad2.Herencia.Ejercicio1.Television":
                        System.out.println("El interes que tiene mas likes es: Television");
                        break;
                    case "Unidad2.Herencia.Ejercicio1.RedSocial":
                        System.out.println("El interes que tiene mas likes es: Red Social");
                        break;
                    case "Unidad2.Herencia.Ejercicio1.Musica":
                        System.out.println("El interes que tiene mas likes es: Musica");
                        break;    
                    
                }
        
        
        //System.out.println("El interes que tiene mas likes es: " + interesMayor);
        
    }
    
    
    
    
}
