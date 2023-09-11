
package Unidad2.Colecciones;

/**
 *
 * @author Hernan
 */
public class Auto {
    
    private String patente;
    private String marca, modelo;
    private int anno;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, int anno) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + '}';
    }

    
    
    
    
}
