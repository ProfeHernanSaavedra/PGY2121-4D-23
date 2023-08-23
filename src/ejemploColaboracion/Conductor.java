/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author USRVI-LC3
 */
public class Conductor {
    
    private String nombre;
    private int edad;
    private Auto autoConductor;
    
    
    //CTRL + SPACE
    public Conductor() {
    }

    public Conductor(String nombre, int edad, Auto autoConductor) {
        this.nombre = nombre;
        this.edad = edad;
        this.autoConductor = autoConductor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Auto getAutoConductor() {
        return autoConductor;
    }

    public void setAutoConductor(Auto autoConductor) {
        this.autoConductor = autoConductor;
    }

    
    
    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    //customer
    
    public void datoMiAuto()
    {
        System.out.println("Nombre Conductor: " + this.getNombre());
        System.out.println("Marca Auto: " + this.getAutoConductor().getMarca());
    }
        
}
