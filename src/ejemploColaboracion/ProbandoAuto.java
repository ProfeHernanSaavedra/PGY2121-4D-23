/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author USRVI-LC3
 */
public class ProbandoAuto {
    
    public static void main(String[] args) {
        
        Auto autito = new Auto("Nissan", "rojo", "VVTT44", 1234567);
        Conductor conductor1 = new Conductor("Juan", 30, autito);
        
        conductor1.datoMiAuto();
        
        
    }
    
}
