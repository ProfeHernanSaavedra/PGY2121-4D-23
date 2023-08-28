package ejericcio132;

import java.util.Scanner;

/**
 *
 * @author USRVI-LC3
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        boolean flag; // validaciones
        //datos a capturar
        //cliente
        int rut,telefono;
        String nombre,mail,direccion;
        char dv;
        //producto
        int codigo,precio,cantidad,totalProductos;
        String subcategoria,descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;
        
        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();
        
        do {
            System.out.println("*****MENU******");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Solicitud y sus Productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Salir (Ver Solicitud)");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese rut:");
                        rut = leer.nextInt();
                        System.out.println("Ingrese DV: ");
                        dv = leer.next().charAt(0);
                        flag = valida.validarRut(rut, dv);
                        if (flag == false) {
                            System.out.println("Rut inválido");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese Nombre: ");
                    nombre = leer.next();
                    
                    do {
                        System.out.println("Ingrese telefono: ");
                        telefono = leer.nextInt();
                        flag = valida.validarLargo8(telefono);
                        if (flag == false) {
                            System.out.println("Telefono no valido (largo 8)");
                        }
                    } while (flag == false);
                    
                    do {
                        System.out.println("Ingrese correo: ");
                        mail = leer.next();
                        flag = valida.validarCorreo(mail);
                        if (flag== false) {
                            System.out.println("Correo no valido (minimo largo 6");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese Direccion: ");
                    direccion = leer.next();
                    
                    //guardar los datos validos en cliente
                    cliente.setRut(rut);
                    cliente.setDv(dv);
                    cliente.setNombre(nombre);
                    cliente.setDireccion(direccion);
                    cliente.setTelefono(telefono);
                    cliente.setMail(mail);
                    
                    System.out.println("---------GUARDADO---------------");
                    System.out.println(cliente);
                    System.out.println("------------------------");
                    break;
                    
                default:
                    
            }
            
        } while (opcion != 4);
        
        
    }
    
}
