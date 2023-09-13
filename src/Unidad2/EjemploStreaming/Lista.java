package Unidad2.EjemploStreaming;

import java.util.ArrayList;

/**
 *
 * @author USRVI-LC3
 */
public class Lista {
    
    private ArrayList<Cancion> listaCanciones;

    public Lista() {
        
        listaCanciones = new ArrayList<>();
        
    }
    
    public boolean agregarCancion(Cancion cancion)
    {
        return listaCanciones.add(cancion);
    }
    
    public void listar()
    {
        for (Cancion cancion : listaCanciones) {
            //System.out.println(cancion);
            System.out.println("Cancion: " + cancion.getTitulo() + " de " + 
                    cancion.getArtista());
        }
    }
    
}
