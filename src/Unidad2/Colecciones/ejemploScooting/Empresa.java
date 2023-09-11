
package Unidad2.Colecciones.ejemploScooting;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Empresa {
    
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        
        listaEmpleados = new ArrayList<>();
    }
    
    //agregar
    public boolean agregar(Empleado emp)        
    {
        return listaEmpleados.add(emp);
    }
    
    //buscar
    public boolean buscarEmpleado(String rut)      
    {
        for (Empleado empleado : listaEmpleados) {
             if (empleado.getRut().equals(rut)) {  // distinto....>>  empleado.getRut() != rut   ---> !empleado.getRut().equals(rut);
                return true;
            }
        }
        return false;
    }
    
    //listar empleados
    
    public void listarEmpleados()
    {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);// --->> System.out.println(empleado.toString());
        }
    }
    
    // elminar Empleado
    public void eliminarEmpleado(String rut)      
    {
        if (buscarEmpleado(rut)) {
            for (Empleado empleado : listaEmpleados) {
                listaEmpleados.remove(empleado);
                System.out.println("Empleado eliminado!!");
            }
        }else
        {
            System.out.println("No existe");
           
        }
     
    }
    
}
