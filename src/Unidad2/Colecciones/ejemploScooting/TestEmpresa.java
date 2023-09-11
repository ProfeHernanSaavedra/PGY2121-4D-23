package Unidad2.Colecciones.ejemploScooting;

/**
 *
 * @author Hernan
 */
public class TestEmpresa {

    public static void main(String[] args) {

        Puesto puesto1 = new Puesto(1, "Programdor Junior");
        Puesto puesto2 = new Puesto(2, "Programdor Senior");

        Empleado empleado1 = new Empleado("1-1", "Armando Casas", 'M', 5, 29, puesto1);
        Empleado empleado2 = new Empleado("2-2", "Maria", 'F', 10, 34, puesto2);

        Empresa empresa = new Empresa();

        //agregar empleado 1
        if (empresa.buscarEmpleado(empleado1.getRut()) == false) {
            empresa.agregar(empleado1);
            System.out.println("Se agrego empleado " + empleado1.getNombreEmpleado());
        } else {
            System.out.println("Empleado existe!!");
        }

//        if (empresa.buscarEmpleado(empleado1.getRut()) == false) {
//            empresa.agregar(empleado1);
//            System.out.println("Se agrego empleado " + empleado1.getNombreEmpleado());
//        }
//        else
//        {
//            System.out.println("Empleado existe!!");
//        }
        //agregar empleado 2
        if (empresa.buscarEmpleado(empleado2.getRut()) == false) {
            empresa.agregar(empleado2);
            System.out.println("Se agrego empleado " + empleado2.getNombreEmpleado());
        } else {
            System.out.println("Empleado existe!!");
        }

        empresa.listarEmpleados();
        
        //eliminar
        empresa.eliminarEmpleado("1-10");
        empresa.eliminarEmpleado(empleado2.getRut());
        
        empresa.listarEmpleados();

    }

}
