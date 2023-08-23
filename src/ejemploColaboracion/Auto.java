/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author USRVI-LC3
 */
public class Auto {
    
    private String marca, color,patente;
    private int numMotor;

    public Auto() {
    }

    public Auto(String marca, String color, String patente, int numMotor) {
        this.marca = marca;
        this.color = color;
        this.patente = patente;
        this.numMotor = numMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", color=" + color + ", patente=" + patente + ", numMotor=" + numMotor + '}';
    }
    
     
    
    
    
}
