
package Unidad2.Colecciones.ejemploScooting;

/**
 *
 * @author Hernan
 */
public class Empleado {
    
    private String rut,nombreEmpleado;
    private char genero; // 'M': masculino , 'F': femenino , 'O' : otro
    private int anno,edad;
    private Puesto puesto;

    public Empleado() {
        
        puesto = new Puesto();
    }

    public Empleado(String rut, String nombreEmpleado, char genero, int anno, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.anno = anno;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreEmpleado=" + nombreEmpleado + ", genero=" + genero + ", anno=" + anno + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
    
    
}
