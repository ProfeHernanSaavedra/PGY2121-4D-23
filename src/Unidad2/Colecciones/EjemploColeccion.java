package Unidad2.Colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hernan
 */
public class EjemploColeccion {

    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Juan");
        listaNombres.add("Maria");
        listaNombres.add("Armando Casas");

        System.out.println(listaNombres);

        //fore + tab --> for each
        for (String dato : listaNombres) {
            System.out.println(dato);
        }

        System.out.println("");
        System.out.println("*******OTRA LISTA********");
        System.out.println("**** LISTA AUTO******");

        ArrayList<Auto> listaAutos = new ArrayList<>();

        Auto auto1 = new Auto("AA2121", "KIA", "RIO", 2020);
        Auto auto2 = new Auto("BB1111", "KIA", "CERATO", 2021);
        Auto auto3 = new Auto("CC3333", "KIA", "SPORTAGE", 2022);
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        
        System.out.println(listaAutos);
        
        System.out.println("Modelos auto: ");
        for (Auto autito : listaAutos) {
            
            System.out.println(autito.getModelo());
        }
        
       

    }

}
