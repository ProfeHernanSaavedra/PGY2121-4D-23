package ejericcio132;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                case 2:
                    //solicitud
                    numero = sol.obtenerNumeroSolicitud();
                    sol.setNumero(numero);
                    sol.setCliente(cliente);
                    Date fechaDate = null;
                    do {
                        System.out.println("Ingrese Fecha (dd-mm-yyyy)");
                        fecha = leer.next();
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                        
                        //trycatch + tab
                        try {
                            fechaDate = formato.parse(fecha);
                            flag = valida.validarFecha(fechaDate);
                        } catch (ParseException e) {
                            flag = false;
                            System.out.println("Fecha no valida (dd-mm-yyyy)");
                        }
                        
                    } while (flag == false);
                    sol.setFecha(fechaDate);
                    
                    //productos
                    System.out.println("¿Cuantos productos ingresara?");
                    totalProductos = leer.nextInt();
                    for (int i = 1; i <= totalProductos; i++) {
                        
                        Producto prod = new Producto();
                        codigo = 0;
                        precio = 0;
                        cantidad = 0;
                        subcategoria = "";
                        descripcion = "";
                        medida  = ' ';
                        
                        do {
                            System.out.println("Ingrese codigo producto");
                            codigo = leer.nextInt();
                            flag = valida.validarLargo4(codigo);
                            if (flag == false) {
                                System.out.println("codigo debe ser largo 4");
                            }
                        } while (flag == false);
                        
                        do {
                            System.out.println("Ingrese Precio:");
                            precio = leer.nextInt();
                            flag = valida.validarNumeroPositivo(precio);
                            if (flag == false) {
                                System.out.println("El precio deb ser positivo");
                            }
                        } while (flag == false);
                        
                        do {
                            System.out.println("Ingrese subcategoria (Fruta o Verdura)");
                            subcategoria = leer.next();
                            flag = valida.validarSubcategoria(subcategoria);
                            if (flag==false) {
                                System.out.println("subcategoria invalida");
                            }
                        } while (flag == false);
                        
                        System.out.println("Ingrese descripcion:");
                        descripcion = leer.next();
                        
                        System.out.println("Ingrese unidad de medida (U:unidad, G:gramos)");
                        medida = leer.next().toUpperCase().charAt(0);
                        
                        if (medida == 'U') {
                            System.out.println("Ingrese unidades");
                        } else {
                            System.out.println("Ingrese gramos");
                        }
                        
                        cantidad = leer.nextInt();
                        
                        prod.setCodigo(codigo);
                        prod.setPrecio(precio);
                        prod.setSubcategoria(subcategoria);
                        prod.setDescripcion(descripcion);
                        prod.setMedida(medida);
                        prod.setCantidad(cantidad);
                        
                        sol.agregarProductos(prod);
                        System.out.println("***********************");
                        System.out.println(sol);
                    }
                    
                    break;
                
                case 3:
                    System.out.println("Ingrese procentaje de descuento 1-100%");
                    porcentaje = leer.nextInt();
                    descuento = sol.descuento(porcentaje);
                    System.out.println("Total $" + sol.getTotal());
                    System.out.println("Descuento $" + descuento);
                    System.out.println("---------------------");
                    System.out.println("a pagar $ "+ (sol.getTotal()-descuento));
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Solcitud terminada");
                    sol.verSolicitud();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
        } while (opcion != 4);
        
        
    }
    
}
